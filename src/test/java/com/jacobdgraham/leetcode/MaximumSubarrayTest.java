package com.jacobdgraham.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.MaximumSubarray;

public class MaximumSubarrayTest {
    
    private static MaximumSubarray maximumSubarray;

    @BeforeAll
    final static void setUp() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    final void testRegularArrayIterativeMethod() {
        final int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        final int expected_output = 6;
        final int actual_output = maximumSubarray.maxSubarrayIterative(nums);
        assertEquals(expected_output, actual_output);
    }

    @Test
    final void testRegularArrayDynamicProgrammingMethod() {
        final int[] nums = new int[]{-2,1,-3,4,-1,2,1-5,4};
        final int expected_output = 6;
        final int actual_output = maximumSubarray.maxSubarrayDynamicProgramming(nums);
        assertEquals(expected_output, actual_output);
    }

    @AfterAll
    final static void tearDown() {
        maximumSubarray = null;
    }
}
