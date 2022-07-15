package com.jacobdgraham.leetcode.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestLongestCommonPrefix {
    
    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    
    @Test
    void testLongestCommonPrefixForArrayElements() {
        String prefixWords[] = {"flower", "flow", "flight"};
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(prefixWords));
    }

    @Test
    void testNoCommonPrefixForArrayElements() {
        String prefixWords[] = {"dog", "racecar", "car"};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(prefixWords));
    }
}
