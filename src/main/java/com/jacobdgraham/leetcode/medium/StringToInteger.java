package com.jacobdgraham.leetcode.medium;

public class StringToInteger {
    
    public final int stringToInteger(final String s) {
        /*
         * First, we have to handle edge cases when the sing is null or has a length of 0
         */
        if (s == null || s.length() == 0) {
            return 0;
        }
        /*
         * We must have three variables:
         * 1. Hold the current position within the sing
         * 2. Hold whether the final result should be positive or negative
         * 3. Hold the total value of the converted number
         */
        int total = 0;
        int finalResultSign = 1;
        int positionWithinString = 0;

        /*
         * According to the problem, the first thing we will do is read in and ignore any leading whitespace characters. They are equal to ' ' characters. There can be any number 
         * of those characters, so we have to use a loop
         */
        while (positionWithinString < s.length() && s.charAt(positionWithinString) == ' ') {
            positionWithinString++;
        }

        /*
         * Next, we have to determine if the final result will be positive or negative. For this, we have to use iteration to determine if the character at our target index is 
         * positive or negative. We only have to check once, as there will only be one positive or negative sign. 
         */
        if (positionWithinString < s.length() && (s.charAt(positionWithinString) == '+' || s.charAt(positionWithinString) == '-')) {
            finalResultSign = s.charAt(positionWithinString) == '+' ? 1 : -1;
            positionWithinString++; 
        }

        /*
         * Next, we will begin iterating through the sing of characters. We will prematurely break out of the loop if the character encountered is a number (0 through 9)
         * To add an additional digit to the number and not tamper with other values, 
         */
        while (positionWithinString < s.length()) {
            int digitFromStringChar = s.charAt(positionWithinString) - '0';
            if (digitFromStringChar < 0 || digitFromStringChar > 9) {
                break;
            }

            /*
             * We need to check for overflow or underflow. We need to verify any overflow or underflow before it actually happens. 
             */
            if (Integer.MAX_VALUE / 10 < total || 
                (Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digitFromStringChar)) {
                return finalResultSign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = 10 * total + digitFromStringChar;
            positionWithinString++;
        }
        return total * finalResultSign;
    }
}
