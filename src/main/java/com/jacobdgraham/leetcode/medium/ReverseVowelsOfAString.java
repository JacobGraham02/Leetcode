package com.jacobdgraham.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"

Example 2:

Input: s = "leetcode"
Output: "leotcede"

 

Constraints:

    1 <= s.length <= 3 * 105
    s consist of printable ASCII characters.


 */
public class ReverseVowelsOfAString {
    
    /**
     * Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"

Example 2:

Input: s = "leetcode"
Output: "leotcede"


Constraints:

    1 <= s.length <= 3 * 105
    s consist of printable ASCII characters.


     * @param s String that will have all vowels reversed
     * @return the String s which has all vowels in reversed positions
     */
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        final Set<Character> vowelsHashset = new HashSet<Character>();
        vowelsHashset.add('a');
        vowelsHashset.add('e');
        vowelsHashset.add('i');
        vowelsHashset.add('o');
        vowelsHashset.add('u');
        vowelsHashset.add('A');
        vowelsHashset.add('E');
        vowelsHashset.add('I');
        vowelsHashset.add('O');
        vowelsHashset.add('U');

        int startPointer = 0;
        int endPointer = s.length() - 1;
        char[] stringCharacterArray = s.toCharArray(); 

       while (startPointer < endPointer) {
            while (startPointer < endPointer && !vowelsHashset.contains(stringCharacterArray[startPointer])) {
                startPointer++;
            }
            while (startPointer < endPointer && !vowelsHashset.contains(stringCharacterArray[endPointer])) {
                endPointer--;
            }

            if (startPointer < endPointer) {
                char startPointerChar = stringCharacterArray[startPointer];
                stringCharacterArray[startPointer] = stringCharacterArray[endPointer];
                stringCharacterArray[endPointer] = startPointerChar;

                startPointer++;
                endPointer--;
            }
        }
        return new String(stringCharacterArray);
    }
}
