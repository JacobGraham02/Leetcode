package com.jacobdgraham.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {
    private static ContainerWithMostWater containerWithMostWater;

    @BeforeAll
    static void setUp() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    void testContainerWithMostWaterRegularArray() {
        final int[] targetArray = new int[]{1,8,6,2,5,4,8,3,7};
        final int expected_output = 49;
        final int actual_output = containerWithMostWater.maxArea(targetArray);
        assertEquals(expected_output, actual_output);
    }

    @Test
    void testContainerWithMostWaterTwoIntegerArray() {
        final int[] targetArray = new int[]{1,1};
        final int expected_output = 1;
        final int actual_output = containerWithMostWater.maxArea(targetArray);
        assertEquals(expected_output, actual_output);
    }

    @AfterAll
    static void tearDown() {
        containerWithMostWater = null;
    }
    
}
