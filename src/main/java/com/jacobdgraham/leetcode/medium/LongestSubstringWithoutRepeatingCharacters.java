package com.jacobdgraham.leetcode.medium;

import java.util.Arrays;

/**
 * Given a string s, find the length of the longest substring without repeating characters
 * 
 * Example 1:
 *  Input s = "abcabcbb"
 *  Output = 3
 *  Explanation: The answer is "abc", with the length of 3
 * 
 * Example 2:
 *  Input s = "bbbb"
 *  Output = 1
 *  Explanation: The answer is "b", with the length of 1
 * 
 * Example 3:
 *  Input s = "pwwkew"
 *  Output = 3
 *  Explanation: The answer is "wke", with the length of 3. Notice that the answer must be a substring, "pwke" is a subsequence and not a substring
 * 
 * 
 * 
 * Approach to solving this problem:
 *  Sliding window approach:
 *      We can use a 'sliding-window approach', where the current substring being searched represents a 'window' of characters. While iterating over the substring, we can 
 *      save all of the substring characters into a data set. When duplicate characters are encountered, we move the window over to the right some specified amount of space.
 *      
 *      1. First, we have to initialize variables for taking the total length of the string, the array to store characters to prevent any duplicate insertions, and
 *      pointers for the leftmost and rightmost side of the string
 *      2. Next, we have a for loop iterating over the entire string. First, we begin to move the array rightmost pointer across the string one character at a time. For each
 *      character, we check if it has appeared before by looking at the corresponding entry in the array
 *      3. If the rightmost character already exists in the array and is greater than or equal to left, we have found a duplicate character and we need to move the left pointer.
 *      We move the left pointer to one position to the right of the duplicate character position.
 *      4. For each character regardless of if a match was found, we need to store the index of each character encountered as we move the rightmost pointer across the string.
 *      We must keep a variable, max_length, to indicate the longest substring length we have found so far. 
 *      5. At the end of the method, we can just return the variable max_length_of_substring because that variable holds the maximum length of a found substring.
 */
public final class LongestSubstringWithoutRepeatingCharacters {
    
    public final int lengthOfLongestSubstring(String s) {
        int length_of_string_s = s.length();
        int max_length_of_substring = 0;
        int[] character_index_in_substring = new int[128];
        Arrays.fill(character_index_in_substring, -1);
        int rightmost_substring_pointer;
        int leftmost_substring_pointer = 0;

        for (rightmost_substring_pointer = 0; rightmost_substring_pointer < length_of_string_s; rightmost_substring_pointer++) {
            if (character_index_in_substring[s.charAt(rightmost_substring_pointer)] >= leftmost_substring_pointer) {
                leftmost_substring_pointer = character_index_in_substring[s.charAt(rightmost_substring_pointer)] + 1;
            }
            character_index_in_substring[s.charAt(rightmost_substring_pointer)] = rightmost_substring_pointer;
            max_length_of_substring = Math.max(max_length_of_substring, ((rightmost_substring_pointer - leftmost_substring_pointer) + 1));
        }

        return max_length_of_substring;
    }

}
