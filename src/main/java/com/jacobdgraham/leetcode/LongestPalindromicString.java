package com.jacobdgraham.leetcode;

/**
 * Palindromic
 *  A string is palindromic if it reads the same forward and backward.
 * 
 * Substring
 *  A substring is a contiguous non-empty sequence of characters within a string.
 * 
 * Given a string s, return the longest palindromic substring in s
 *  
 * Example 1
 *  Input: s = "babad"
 *  Output: "bab"
 *  Explanation: "aba" is also a valid answer
 * 
 * Example 2
 *  Input: s = "cbbd"
 *  Output: "bb"
 * 
 * Contstraints:
 *  1 <= s.length <= 100
 *  s consist of only digits and English letters
 */
public class LongestPalindromicString {
    
    public final String longestPalindrome(String palindromic_string) {
        if (palindromic_string.length() == 0 || palindromic_string.length() == 1) {
            return palindromic_string;
        }

        int start_of_substring = 0;
        int end_of_substring = 0;

        for (int i = 0; i < palindromic_string.length() - 1; i++) {
            int length_of_odd_palindrome = checkOutwardsFromCenterPalindrome(palindromic_string, i, i);
            int length_of_even_palindrome = checkOutwardsFromCenterPalindrome(palindromic_string, i, i+1);

            int length_of_palindrome = Math.max(length_of_even_palindrome, length_of_odd_palindrome);

            if (length_of_palindrome > (end_of_substring - start_of_substring)) {
                start_of_substring = i - (length_of_palindrome - 1) / 2;
                end_of_substring = i + (length_of_palindrome / 2);
            }
        }
        return palindromic_string.substring(start_of_substring, end_of_substring + 1);
    }

    private int checkOutwardsFromCenterPalindrome(String palindromic_string, int left_pointer, int right_pointer) {
        while (left_pointer >= 0 && right_pointer < palindromic_string.length() && palindromic_string.charAt(left_pointer) == palindromic_string.charAt(right_pointer)) {
            left_pointer--;
            right_pointer++;
        }

        return (right_pointer - left_pointer) - 1;
    }
}
// a b a
// a b b a