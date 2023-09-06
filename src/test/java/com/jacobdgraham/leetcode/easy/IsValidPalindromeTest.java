package com.jacobdgraham.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class IsValidPalindromeTest {
    
    private static IsValidPalindrome isValidPalindrome;

    @BeforeAll
    final static void setUp() {
        isValidPalindrome = new IsValidPalindrome();
    }

    @Test
    final void testPalindromeWithNonAlphanumericCharacter() {
        final String input_string = "A man, a plan, a canal: Panama";
        final boolean expected_output = true;
        final boolean actual_output = isValidPalindrome.isPalindrome(input_string);
        assertEquals(expected_output, actual_output);
    }

    @Test
    final void testPalindromeOnEmptyString() {
        final String input_string = "";
        final boolean expected_output = true;
        final boolean actual_output = isValidPalindrome.isPalindrome(input_string);
        assertEquals(expected_output, actual_output);
    }

    @Test
    final void testPalindromeOnNormalString() {
        final String input_string = "civic";
        final boolean expected_output = true;
        final boolean actual_output = isValidPalindrome.isPalindrome(input_string);
        assertEquals(expected_output, actual_output);
    }
}
