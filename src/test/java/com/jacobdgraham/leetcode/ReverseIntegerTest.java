package com.jacobdgraham.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.ReverseInteger;

public class ReverseIntegerTest {
    private static ReverseInteger reverse_integer;

    @BeforeAll
    public static void setUp() {
        reverse_integer = new ReverseInteger();
    }

    @Test
    void testReversingAnIntegerNumber() {
        final int negative_integer = -123;
        final int expected_output = -321;
        final int output_of_function = reverse_integer.reverse(negative_integer);
        assertEquals(expected_output, output_of_function);
    }

    @Test
    void testReverseNumberWithZero() {
        final int zero_integer = 120;
        final int expected_output = 21;
        final int output_of_function = reverse_integer.reverse(zero_integer);
        assertEquals(expected_output, output_of_function);
    }

    @AfterAll
    public static void tearDown() {
        reverse_integer = null;
    }
}
