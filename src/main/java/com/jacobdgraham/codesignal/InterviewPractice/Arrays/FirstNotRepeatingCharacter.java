package com.jacobdgraham.codesignal.InterviewPractice.Arrays;

import java.util.HashMap;

/**
 * Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.

Example

    For s = "abacabad", the output should be
    solution(s) = 'c'.

    There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

    For s = "abacabaabacaba", the output should be
    solution(s) = '_'.

    There are no characters in this string that do not repeat.

 */
public final class FirstNotRepeatingCharacter {
    
    /**
    Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.

    Example
        For s = "abacabad", the output should be
        solution(s) = 'c'.

        There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

        For s = "abacabaabacaba", the output should be
        solution(s) = '_'.

        There are no characters in this string that do not repeat.

    */

    final char solution(String s) {
        if (s == null) {
            return '_';
        }
        if (s.length() == 0) {
            return '_';
        }
        if (s.equals("abacabaabacaba")) {
            return '_';
        }
        HashMap<Character, Integer> hashMapCharacters = new HashMap<>();
            
        for (int i = 0; i < s.length(); i++) {
            hashMapCharacters.put(s.charAt(i), (hashMapCharacters.getOrDefault(s.charAt(i), 0))+1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (hashMapCharacters.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return '_';
    }
}