package com.jacobdgraham.leetcode.medium;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range 
 * [-2^31, 2^31-1], then return 0
 * 
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned)
 * 
 * Example 1:
 *  Input: x = 123
 *  Output: 321
 * 
 * Example 2:
 *  Input: x = -123
 *  Output: -321
 * 
 * Example 3:
 *  Input: x = 120
 *  Output: 21
 * 
 * Constraints:
 *  -2^31 <= x <= 2^31 - 1
 */
public class ReverseInteger {

    public final int reverse(int x) {
        int final_int_result = 0;

        while (x != 0) {
            int x_tail_value = x % 10;
            final_int_result = (final_int_result * 10) + x_tail_value;
            x /= 10;
            if (final_int_result > Integer.MAX_VALUE || final_int_result < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return final_int_result;
    }
}
