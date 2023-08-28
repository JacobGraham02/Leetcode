package com.jacobdgraham.leetcode.medium;

/**
 * Roman numbers are represented by seven different symbols: I, V, X, L, C, D, and M.
 * 
 * Symbol   Value
 *   I        1
 *   V        5
 *   X        10
 *   L        50
 *   C        100
 *   D        500
 *   M        1000
 * 
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is 
 * XX + V + II. 
 * Roman numerals are usually written largest to smallest from left to right. Howeverm the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is 
 * before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * I can be placed before V (5) and X (10) to make 4 and 9
 * X can be placed before L (50) and C(100) to make 40 and 90
 * C can be placed before D (500) and M(1000) to make 400 and 900
 * Given an integer, convert it to a roman numeral
 * 
 * Example 1:
 *  Input: num = 3
 *  Output: "III"
 *  Explanation: 3 is represented as 3 ones
 * 
 * Example 2:
 *  Input: num = 58
 *  Output: "LVIII"
 *  Explanation: L = 50, V = 5, III = 3
 * 
 * Example 3:
 *  Input: num = 1994
 *  Output: "MCMXCIV"
 *  Explanation: M = 1000, CM = 900, XC = 90, IV = 4
 * 
 * Constraints:
 *  1 <= num <= 3999
 * 
 * 
 * 
 * Time complexity of my solution is O(13 + N), where N is the input number. I am first iterating through a fixed set of keys (13 iterations) 
 * Space complexity of my solution is O(1) because I am using fixed-size arrays for keys and values, and the additional space used for the string builder is constant
 */
public class IntegerToRomanOptimized {
    private final int[] keys = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private final String[] values = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    
    public String intToRoman(int num) {
        StringBuilder roman_numeral_result = new StringBuilder();
            
        for (int i = 0; i < keys.length; i++) {
            while (num >= keys[i]) {
                roman_numeral_result.append(values[i]);
                num -= keys[i];
            }
        }
        return roman_numeral_result.toString();
    }
}

