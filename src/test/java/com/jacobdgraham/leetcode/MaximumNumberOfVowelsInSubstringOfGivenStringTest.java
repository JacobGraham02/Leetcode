package com.jacobdgraham.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.MaximumNumberOfVowelsInSubstringOfGivenString;

public class MaximumNumberOfVowelsInSubstringOfGivenStringTest {
    private MaximumNumberOfVowelsInSubstringOfGivenString solution;

    @BeforeEach
    void setUp() {
        solution = new MaximumNumberOfVowelsInSubstringOfGivenString();
    }

    @Test
    void testMaxVowels_Example1() {
        String s = "abciiidef";
        int k = 3;
        int expected = 3;
        int actual = solution.maxVowels(s, k);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxVowels_Example2() {
        String s = "aeiou";
        int k = 2;
        int expected = 2;
        int actual = solution.maxVowels(s, k);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxVowels_AllVowels() {
        String s = "aeiou";
        int k = 5;
        int expected = 5;
        int actual = solution.maxVowels(s, k);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxVowels_NoVowels() {
        String s = "bcdfgh";
        int k = 3;
        int expected = 0;
        int actual = solution.maxVowels(s, k);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxVowels_KGreaterThanStringLength() {
        String s = "zzzzz";
        int k = 6;
        int expected = 0;
        int actual = solution.maxVowels(s, k);
        assertEquals(expected, actual);
    }
}
