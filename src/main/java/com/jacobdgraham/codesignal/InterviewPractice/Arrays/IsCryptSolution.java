package com.jacobdgraham.codesignal.InterviewPractice.Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * A cryptarithm is a mathematical puzzle for which the goal is to find the correspondence between letters and digits, 
 * such that the given arithmetic equation consisting of letters holds true when the letters are converted to digits.

You have an array of strings crypt, the cryptarithm, and an an array containing the mapping of letters and digits, solution. 
The array crypt will contain three non-empty strings that follow the structure: [word1, word2, word3], which should be interpreted as the word1 + word2 = word3 cryptarithm.

If crypt, when it is decoded by replacing all of the letters in the cryptarithm with digits using the mapping in solution, 
becomes a valid arithmetic equation containing no numbers with leading zeroes, the answer is true. If it does not become a valid arithmetic solution, the answer is false.

Note that number 0 doesn't contain leading zeroes (while for example 00 or 0123 do).

Example

For crypt = ["SEND", "MORE", "MONEY"] and

solution = [['O', '0'],
            ['M', '1'],
            ['Y', '2'],
            ['E', '5'],
            ['N', '6'],
            ['D', '7'],
            ['R', '8'],
            ['S', '9']]

the output should be
solution(crypt, solution) = true.

When you decrypt "SEND", "MORE", and "MONEY" using the mapping given in crypt, you get 9567 + 1085 = 10652 which is correct and a valid arithmetic equation.

For crypt = ["TEN", "TWO", "ONE"] and

solution = [['O', '1'],
            ['T', '0'],
            ['W', '9'],
            ['E', '5'],
            ['N', '4']]

the output should be
solution(crypt, solution) = false.

Even though 054 + 091 = 145, 054 and 091 both contain leading zeroes, meaning that this is not a valid solution.
 */

public final class IsCryptSolution {

    /**
     * A cryptarithm is a mathematical puzzle for which the goal is to find the correspondence between letters and digits, 
     * such that the given arithmetic equation consisting of letters holds true when the letters are converted to digits.

    You have an array of strings crypt, the cryptarithm, and an an array containing the mapping of letters and digits, solution. 
    The array crypt will contain three non-empty strings that follow the structure: [word1, word2, word3], which should be interpreted as the word1 + word2 = word3 cryptarithm.

    If crypt, when it is decoded by replacing all of the letters in the cryptarithm with digits using the mapping in solution, 
    becomes a valid arithmetic equation containing no numbers with leading zeroes, the answer is true. If it does not become a valid arithmetic solution, the answer is false.

    Note that number 0 doesn't contain leading zeroes (while for example 00 or 0123 do).
    */
    final boolean solution(String[] crypt, char[][] solution) {
        if (crypt == null || crypt.length == 0) {
            return false;
        }
        if (solution == null || solution.length == 0) {
            return false;
        }
        final Map<Character, Character> charToDigitMap = new HashMap<>();
        
        for (char[] characterValues : solution) {
            charToDigitMap.put(characterValues[0], characterValues[1]);
        }
        
        final String numberFromString1 = convertStringToNumber(crypt[0], charToDigitMap);
        final String numberFromString2 = convertStringToNumber(crypt[1], charToDigitMap);
        final String numberFromString3 = convertStringToNumber(crypt[2], charToDigitMap);
        
        if (hasLeadingZero(numberFromString1) || hasLeadingZero(numberFromString2) || hasLeadingZero(numberFromString3)) {
            return false;
        }
        
        final long numberFromString1Integer = Long.parseLong(numberFromString1);
        final long numberFromString2Integer = Long.parseLong(numberFromString2);
        final long numberFromString3Integer = Long.parseLong(numberFromString3);
        
        return numberFromString1Integer + numberFromString2Integer == numberFromString3Integer;
    }


    private String convertStringToNumber(final String word, final Map<Character, Character> charToDigitMap) {
        
        StringBuilder stringToNumbStringBuilder = new StringBuilder();
        for (char c : word.toCharArray()) {
            stringToNumbStringBuilder.append(charToDigitMap.get(c));    
        }
        return stringToNumbStringBuilder.toString();
    }

    private boolean hasLeadingZero(final String number) {
        return number.length() > 1 &&number.charAt(0) == '0';
    }
}
