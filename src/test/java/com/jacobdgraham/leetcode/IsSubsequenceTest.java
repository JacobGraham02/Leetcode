package com.jacobdgraham.leetcode;

import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.IsSubsequence;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class IsSubsequenceTest {

    private final IsSubsequence checker = new IsSubsequence();

    @Test
    public void testIsSubsequencePositive() {
        assertTrue(checker.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void testIsSubsequenceNegative() {
        assertFalse(checker.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    public void testEmptyS() {
        assertTrue(checker.isSubsequence("", "ahbgdc"));
    }

    @Test
    public void testEmptyT() {
        assertFalse(checker.isSubsequence("abc", ""));
    }

    @Test
    public void testBothEmpty() {
        assertTrue(checker.isSubsequence("", ""));
    }

    @Test
    public void testSameStrings() {
        assertTrue(checker.isSubsequence("abc", "abc"));
    }

    @Test
    public void testSingleCharacterFound() {
        assertTrue(checker.isSubsequence("b", "abc"));
    }

    @Test
    public void testSingleCharacterNotFound() {
        assertFalse(checker.isSubsequence("d", "abc"));
    }
}
