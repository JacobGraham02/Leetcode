package com.jacobdgraham.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public final class ValidAnagramTest {
    
    static ValidAnagram validAnagram = new ValidAnagram();

    @BeforeAll
    final static void setUp() {
        validAnagram = new ValidAnagram();
    }

    @Test
    final void testValidAnagramString() {
        final String original_string = "anagram";
        final String valid_anagram_string = "nagaram";
        final boolean expected_output = true;
        final boolean actual_output = validAnagram.isAnagram(original_string, valid_anagram_string);
        assertEquals(expected_output, actual_output);
    }

    @Test
    final void testInvalidAnagramString() {
        final String original_string = "rat";
        final String invalid_anagram_string = "car";
        final boolean expected_output = false;
        final boolean actual_output = validAnagram.isAnagram(original_string, invalid_anagram_string);
        assertEquals(expected_output, actual_output);
    }

    @AfterAll
    final static void tearDown() {
        validAnagram = null;
    }
}
