package com.jacobdgraham.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaximumAverageSubarray1Test {

    private final MaximumAverageSubarray1 maximumAverageSubarray1 = new MaximumAverageSubarray1();

    @Test
    public void testFindMaxAverageStandardCase() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double expected = 12.75;
        assertEquals(expected, maximumAverageSubarray1.findMaxAverage(nums, k), 0.0001);
    }

    @Test
    public void testFindMaxAverageExactKElements() {
        int[] nums = {5, -1, 4};
        int k = 3;
        double expected = 2.6667;
        assertEquals(expected, maximumAverageSubarray1.findMaxAverage(nums, k), 0.0001);
    }

    @Test
    public void testFindMaxAverageSingleElement() {
        int[] nums = {10};
        int k = 1;
        double expected = 10.0;
        assertEquals(expected, maximumAverageSubarray1.findMaxAverage(nums, k), 0.0001);
    }
}
