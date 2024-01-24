package com.jacobdgraham.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ReverseWordsInStringTest {

    private static ReverseWordsInString reverser;

    @BeforeAll
    static void setUp() {
        reverser = new ReverseWordsInString();
    }

    @Test
    public void testRegularInput() {
        assertEquals("blue is sky the", reverser.reverseWords("the sky is blue"));
    }

    @Test
    public void testLeadingAndTrailingSpaces() {
        assertEquals("world hello", reverser.reverseWords("  hello world  "));
    }

    @Test
    public void testMultipleSpacesBetweenWords() {
        assertEquals("example good a", reverser.reverseWords("a good   example"));
    }

    @Test
    public void testSingleWord() {
        assertEquals("hello", reverser.reverseWords("hello"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", reverser.reverseWords(""));
    }

    @Test
    public void testStringWithOnlySpaces() {
        assertEquals("", reverser.reverseWords("    "));
    }

    @Test
    public void testStringWithSpacesBetweenWords() {
        assertEquals("world hello", reverser.reverseWords("hello    world"));
    }

    @AfterAll
    static void tearDown() {
        reverser = null;
    }
}
