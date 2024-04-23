package com.jacobdgraham.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.TwoSum;

public class TwoSumTest {
    
    private static TwoSum twoSum;

    @BeforeAll
    static final void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    final void testArrayWithTwoIntegers() {
        final int[] input = new int[]{3,3};
        final int target = 6;
        final int[] expected_output = new int[]{1,0};
        final int[] actual_output = twoSum.twoSum(input, target);
        assertArrayEquals(expected_output, actual_output);
    } 

    @Test
    final void testArrayWithFourIntegers() {
        final int[] input = new int[]{2,7,11,15};
        final int target = 9;
        final int[] expected_output = new int[]{1,0};
        final int[] actual_output = twoSum.twoSum(input, target);
        assertArrayEquals(expected_output, actual_output);
    }

    @AfterAll
    static final void tearDown() {
        twoSum = null;
    }
}
