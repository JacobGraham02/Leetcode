package com.jacobdgraham.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class IntegerToRomanOptimizedTest {
    private static IntegerToRomanOptimized integerToRomanOptimized = new IntegerToRomanOptimized();
    
    @BeforeAll
    static void setUp() {
        integerToRomanOptimized = new IntegerToRomanOptimized();
    }

    @Test
    void testNumber3() {
        final int input_number = 3;
        final String expected_output = "III";
        final String actual_output = integerToRomanOptimized.intToRoman(input_number);
        assertEquals(expected_output, actual_output);
    }

    @Test
    void testNumber58() {
        final int input_number = 58;
        final String expected_output = "LVIII";
        final String actual_output = integerToRomanOptimized.intToRoman(input_number);
        assertEquals(expected_output, actual_output);
    }

    @Test
    void testNumber1994() {
        final int input_number = 1994;
        final String expected_output = "MCMXCIV";
        final String actual_output = integerToRomanOptimized.intToRoman(input_number);
        assertEquals(expected_output, actual_output);
    }

    @AfterAll
    static void tearDown() {
        integerToRomanOptimized = null;
    }
} 
