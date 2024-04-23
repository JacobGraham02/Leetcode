package com.jacobdgraham.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.LongestPalindromicString;

final public class LongestPalindromicStringTest {

    private static LongestPalindromicString longestPalindromicString;

    @BeforeAll
    static void setUp() {
        longestPalindromicString = new LongestPalindromicString();
    }

    @Test
    final void testLongestPalindromicSubstringEvenLengthString() {
        final String test_string = "cbbd";
        final String expected_substring = "bb";
        final String output_substring = longestPalindromicString.longestPalindrome(test_string);
        assertEquals(expected_substring, output_substring);
    }

    @Test
    final void testLongestPalindromicSubstringOddLengthString() {
        final String test_string = "babad";
        final String expected_substring = "aba";
        final String output_substring = longestPalindromicString.longestPalindrome(test_string);
        assertEquals(expected_substring, output_substring);
    }

    @AfterAll
    static void tearDown() {
        longestPalindromicString = null;
    }
}
