package com.jacobdgraham.leetcode;

import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.StringCompression;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCompressionTest {

    private final StringCompression compressor = new StringCompression();

    @Test
    void testSingleCharacter() {
        char[] chars = {'a'};
        int length = compressor.compress(chars);
        assertEquals(1, length);
        assertEquals('a', chars[0]);
    }

    @Test
    void testSimpleCompression() {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int length = compressor.compress(chars);
        assertEquals(6, length);
        assertArrayEquals(new char[] {'a', '2', 'b', '2', 'c', '3'}, chars, length);
    }

    @Test
    void testLongCompression() {
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int length = compressor.compress(chars);
        assertEquals(4, length);
        assertArrayEquals(new char[] {'a', 'b', '1', '2'}, chars, length);
    }

    @Test
    void testNoCompressionNeeded() {
        char[] chars = {'a', 'b', 'c'};
        int length = compressor.compress(chars);
        assertEquals(3, length);
        assertArrayEquals(new char[] {'a', 'b', 'c'}, chars, length);
    }

    private void assertArrayEquals(char[] expected, char[] actual, int length) {
        for (int i = 0; i < length; i++) {
            assertEquals(expected[i], actual[i], "Mismatch at index " + i);
        }
    }
}
