package com.jacobdgraham.dailycodingproblem.DailyCodingProblem3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given a list of words, find all pairs of unique indices such at the concatenation of the two words is a palindrome
 * 
 * For example, given the list ["code", "edoc", "da", "d"] return [(0,1), (1,0), (2,3)]
 */
public final class DailyCodingProblem3 {
    
    /**
     * 
     * @param str The concatention of two strings 
     * @return boolean value indicating whether the supplied string is a palindrome
     */
    private boolean isPalindrome(final String str) {
        if (str.equals(null) || str.equals("")) {
            return false;
        }
        StringBuilder reversed_string_builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed_string_builder.append(str.charAt(i));
        }
        return reversed_string_builder.toString().equals(str);
    }

    public ArrayList<String> indicesOfConcatenatedPalindromes(final ArrayList<String> arraylist_strings) {
        final ArrayList<String> strings = new ArrayList<String>();
        for (int array_target_string_index = 0; array_target_string_index < arraylist_strings.size(); array_target_string_index++) {
            
            String target_arraylist_element = arraylist_strings.get(array_target_string_index);

            for (int array_compare_string_index = 0; array_compare_string_index < arraylist_strings.size(); array_compare_string_index++) {
                if (!(array_target_string_index == array_compare_string_index)) {

                    String arraylist_element_to_compare = arraylist_strings.get(array_compare_string_index);
                    String concatenated_array_strings = target_arraylist_element + arraylist_element_to_compare;
                    
                    if (isPalindrome(concatenated_array_strings)) {
                        strings.add(String.format("(%d,%d)",array_target_string_index, array_compare_string_index));
                    }
                    
                }
            }
        }
        return strings;
    }
}
