package com.jacobdgraham.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * The time complexity of my algorithm here is O(13 * log(13) + N), where N is the input number. I sort the keys (log(13)), iterate over the map 13 times (13) and decrement the input
 * number (N times).
 * The space complexity of my algorithm here is O(13), where the Map for the keys and values hold 13 elements. 
 */
public class IntegerToRomanUnoptimized {
    private final Map<Integer, String> integer_to_roman_numeral_map = new HashMap<Integer, String>();
    
    public IntegerToRomanUnoptimized() {
        integer_to_roman_numeral_map.put(1000, "M");
        integer_to_roman_numeral_map.put(900, "CM");
        integer_to_roman_numeral_map.put(500, "D");
        integer_to_roman_numeral_map.put(400, "CD");
        integer_to_roman_numeral_map.put(100, "C");
        integer_to_roman_numeral_map.put(90, "XC");
        integer_to_roman_numeral_map.put(50, "L");
        integer_to_roman_numeral_map.put(40, "XL");
        integer_to_roman_numeral_map.put(10, "X");
        integer_to_roman_numeral_map.put(9, "IX");
        integer_to_roman_numeral_map.put(5, "V");
        integer_to_roman_numeral_map.put(4, "IV");
        integer_to_roman_numeral_map.put(1, "I");
    }
    
    public final String intToRoman(int num) {
        StringBuilder roman_numeral_result = new StringBuilder();
        List<Integer> keys = new ArrayList<>(integer_to_roman_numeral_map.keySet());
        Collections.sort(keys, Collections.reverseOrder());
        
        for (int key : keys) {
            while (num > key) {
                roman_numeral_result.append(integer_to_roman_numeral_map.get(key));
                num -= key;
            }
        }
        return roman_numeral_result.toString();
    }
}
