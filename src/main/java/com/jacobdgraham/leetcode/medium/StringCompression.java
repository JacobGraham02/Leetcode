package com.jacobdgraham.leetcode.medium;

/**
 * Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

    If the group's length is 1, append the character to s.
    Otherwise, append the character followed by the group's length.

The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

Example 1:

Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

Example 2:

Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.

Example 3:

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".

Constraints:

    1 <= chars.length <= 2000
    chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.


 */
public class StringCompression {

    /**
     * Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

    If the group's length is 1, append the character to s.
    Otherwise, append the character followed by the group's length.

The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

Example 1:

Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

Example 2:

Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.

Example 3:

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".

Constraints:

    1 <= chars.length <= 2000
    chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.


     * @param chars char[] array of characters to compress
     * @return the number of strings compressed
     */
    public int compress(char[] chars) {
        /*
        We will modify the input parameter array in-place, so we do not take unnecessary space. 
        In this algorithm, we must use 2 pointers: one for iterating through the original character array and one
        for keeping track of the current position in the compressed array. 
        Additionally, we must also allocate a variable that keeps track of the count of consecutive characters.
        We must first set the current letter in the array to the first array  character, and initialize the count
        for the total number of the current letters to 0.
        We will increment the count and letter we are currently iterating by 1 until we find a different character
        or each the end of the array
        */
        int positionInCompressedArray = 0;

        for (int i = 0; i < chars.length;) {
            final char currentLetter = chars[i];
            int countOfCurrentLetter = 0;

            while (i < chars.length && chars[i] == currentLetter) {
                ++countOfCurrentLetter;
                ++i;
            }

            /*
            When we find a different character or reach the end of the array, we must write the current letter
            to the compressed array. If the count is greater than 1, write the count of the letter as a string to the
            compressed array. We must reset the counter for the current letter and set the current letter to the
            new letter. We use ++ after the variable name to assign the variable value, and then increment by 1. 
            */
            chars[positionInCompressedArray++] = currentLetter;

            if (countOfCurrentLetter > 1) {
                for (final char c : String.valueOf(countOfCurrentLetter).toCharArray()) {
                    chars[positionInCompressedArray++] = c;
                }
            }
        }
        return positionInCompressedArray;
    }
}
