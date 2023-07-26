package com.jacobdgraham.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public final class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @BeforeEach
    public final void setUp() {
        longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    public final void testStringAbcabcbb() {
        final String s = "abcabcbb";
        final int expected_longest_substring = 3;
        final int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(expected_longest_substring, result);
    }

    @AfterEach
    public final void tearDown() {
        longestSubstringWithoutRepeatingCharacters = null;
    }
}