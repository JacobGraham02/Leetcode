package com.jacobdgraham.leetcode.Easy;

public class PalindromeNumber {

    /**
     * Given an integer x, return true if x is a palindrome integer. An integer is a palindrome when it reads the same backward as forward. 
     * @param x
     * @return
     */
    public boolean isPalindromeStringConversion(int x) {
        String number = String.valueOf(x);
        StringBuilder reversedString = new StringBuilder(number).reverse();
        return reversedString.toString().equals(number);
        
    }

    /**
     * Given an integer x, return true if x is a palindrome integer. An integer is a palindrome when it reads the same backward as forward. 
     * @param x
     * @return
     */
    public boolean isPalindromeNoConversion(int x) {
        // First, let us check for boundary conditions like x not negative and such
        // The number itself cannot be less than 0 (left side of OR operator). Furthermore, the first and last digit must both be a 0
        // for a palindrome to exist (right side of OR operator).
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversedNumber = 0;
        /**
        * Result of 1221 when both multiplying by 10 and modulus by 10:
        reversedNumber * 10 = 0. reversedNumber + x % 10 = 1. x / 10 = 122. 
        reversedNumber * 10 = 10. reversedNumber + x % 10 = 12. x / 10 = 12.  
        
        In a palindrome, typically the middle integer of a number or string
        does not matter. Therefore, you can remove it, particularly when your number has an odd
        number of digits or a number is odd. 
        */ 
        while (x > reversedNumber) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x = x / 10;
        }
        
        if (x == reversedNumber || x == reversedNumber / 10) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean result = palindromeNumber.isPalindromeStringConversion(121);
        System.out.println(result);
    }
}