package com.jacobdgraham.leetcode;

/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 * Example 1:
 *   Input: s = "anagram", t = "nagaram"
 *   Output: true
 * Example 2:
 *   Input: s = "rat", t = "car"
 *   Output: false
 * Constraints:
 *  1 <= s.length, t.length <= 5 * 104
 *  s and t consist of lowercase English letters.
 *
 * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */
public final class ValidAnagram {
    /**
     * Leetcode specified all string characters already in lowercase, so no need to convert the string to all lowercase
     * Below, I fetch the array location from the value of character 'a' subtracted from s.charAt(i) in each loop. This is a trick to generate an integer value from subtracting a 
     * character from a character, according to the ASCII table. 
     * E.g. the character b is 98, while a is 97, 98 - 97 = 1, which is the second location in the array, and corresponds with the English alphabet letter 'b'. 
     * @param s the original string
     * @param t the anagram of the original string
     * @return whether 't' is an anagram of the original string 's'
     */
    public final boolean isAnagram(String s, String t) {
        final int[] original_anagram_letter_frequency = new int[26];

        for (int i = 0; i < s.length(); i++) {
            original_anagram_letter_frequency[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            original_anagram_letter_frequency[t.charAt(i)-'a']--;
        }

        for (int i = 0; i < original_anagram_letter_frequency.length - 1; i++) {
            if (original_anagram_letter_frequency[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
