package com.jacobdgraham.leetcode.medium;

/**
 * Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 
Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

 

Constraints:

    1 <= s.length <= 104
    s contains English letters (upper-case and lower-case), digits, and spaces ' '.
    There is at least one word in s.

 */
public class ReverseWordsInString {
    
    /**
     * Given an input string s, reverse the order of the words.
        A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
        Return a string of the words in reverse order concatenated by a single space.
        Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra space
     * @param s String that will have words reversed inside of it
     * @return String with the words in parameter s reversed
     */
    public final String reverseWords(final String stringToReverseWords) {
        /*
         * First, we must trim all leading and trailing white space from the string, and then use a regex pattern to split the individual string words 
         * while also removing leading and trailing whitespace on those individual words. Because we get an array of Strings that are in order, we must
         * iterate from the back to the front of the array. For each individual word that we append to the StringBuilder, we also append a space character.
         * To avoid an ArrayIndexOutOfBoundsException, we will go from the length of the array - 1 to the second word in the string. We go the second instead of the first
         * word because if we went to the first word, there would be a trailing space character at the end of the string, which we do not want, as we would be appending
         * a " " to the final word in the new string. 
         * 
         * I used a StringBuilder because that data structure is more efficient than using a regular String when rapeatedly appending Strings
         */
        final String stringWithNoLeadingTrailingWhiteSpace = stringToReverseWords.trim();
        final String[] stringWithSeparatedWords = stringWithNoLeadingTrailingWhiteSpace.split("\\s+");
        final StringBuilder stringBuilderWithReversedWords = new StringBuilder();

        for (int i = stringWithSeparatedWords.length-1; i > 0; i--) {
            stringBuilderWithReversedWords.append(stringWithSeparatedWords[i]);
            stringBuilderWithReversedWords.append(" ");
        }
        
        stringBuilderWithReversedWords.append(stringWithSeparatedWords[0]);
        return stringBuilderWithReversedWords.toString();
    }
}
