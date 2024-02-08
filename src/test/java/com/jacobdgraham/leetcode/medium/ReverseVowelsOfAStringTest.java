package com.jacobdgraham.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseVowelsOfAStringTest {

    private final ReverseVowelsOfAString reverseVowelsOfAString = new ReverseVowelsOfAString();

    @Test
    public void testReverseVowelsHello() {
        assertEquals("holle", reverseVowelsOfAString.reverseVowels("hello"));
    }

    @Test
    public void testReverseVowelsLeetcode() {
        assertEquals("leotcede", reverseVowelsOfAString.reverseVowels("leetcode"));
    }

    @Test
    public void testReverseVowelsNoVowels() {
        assertEquals("bcdfg", reverseVowelsOfAString.reverseVowels("bcdfg"));
    }

    @Test
    public void testReverseVowelsEmptyString() {
        assertEquals("", reverseVowelsOfAString.reverseVowels(""));
    }

    @Test
    public void testReverseVowelsSingleVowel() {
        assertEquals("a", reverseVowelsOfAString.reverseVowels("a"));
    }

    @Test
    public void testReverseVowelsMixedCase() {
        assertEquals("Aa", reverseVowelsOfAString.reverseVowels("aA"));
    }
}
