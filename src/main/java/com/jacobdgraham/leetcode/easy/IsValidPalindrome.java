package com.jacobdgraham.leetcode.easy;

/**
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
 
Example 1:
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.

Example 3:
    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.

Constraints:
    1 <= s.length <= 2 * 105
    s consists only of printable ASCII characters.
 */
public final class IsValidPalindrome {
    
    /**
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.
    
    Example 1:
        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.

    Example 2:
        Input: s = "race a car"
        Output: false
        Explanation: "raceacar" is not a palindrome.

    Example 3:
        Input: s = " "
        Output: true
        Explanation: s is an empty string "" after removing non-alphanumeric characters.
        Since an empty string reads the same forward and backward, it is a palindrome.

    Constraints:
        1 <= s.length <= 2 * 105
        s consists only of printable ASCII characters.
    */
    public final boolean isPalindrome(String s) {
        final int string_length = s.length();
        int right_side_pointer = string_length - 1;
        int left_side_pointer = 0;

        while (left_side_pointer < right_side_pointer) {

            while (left_side_pointer < right_side_pointer && !Character.isLetterOrDigit(s.charAt(left_side_pointer))) {
                left_side_pointer++;
            }
            
            while (left_side_pointer < right_side_pointer && !Character.isLetterOrDigit(s.charAt(right_side_pointer))) {
                right_side_pointer--;
            }

            if (Character.toLowerCase(s.charAt(left_side_pointer)) != Character.toLowerCase(s.charAt(right_side_pointer))) {
                return false;
            }

            left_side_pointer++;
            right_side_pointer--;
        }
        return true;
    } 
}
