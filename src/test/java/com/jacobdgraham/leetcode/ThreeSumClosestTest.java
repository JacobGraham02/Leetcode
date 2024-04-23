package com.jacobdgraham.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.ThreeSumClosest;

public class ThreeSumClosestTest {

    private static ThreeSumClosest threeSumClosestSolver;

    @BeforeAll
    static void setUp() {
        threeSumClosestSolver = new ThreeSumClosest();
    }

    @Test
    public void testClosestSumNormalCase() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int expected = 2;
        assertEquals(expected, threeSumClosestSolver.threeSumClosest(nums, target),
            "The closest sum does not match the expected value");
    }

    @Test
    public void testAllZeroes() {
        int[] nums = {0, 0, 0};
        int target = 1;
        int expected = 0;
        assertEquals(expected, threeSumClosestSolver.threeSumClosest(nums, target),
            "The closest sum does not match the expected value");
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-3, -2, -5, -8};
        int target = -10;
        int expected = -10;
        assertEquals(expected, threeSumClosestSolver.threeSumClosest(nums, target),
            "The closest sum does not match the expected value");
    }

    @Test
    public void testMixedNumbers() {
        int[] nums = {-1, 2, 5, -4, 3};
        int target = 3;
        int expected = 3;
        assertEquals(expected, threeSumClosestSolver.threeSumClosest(nums, target),
            "The closest sum does not match the expected value");
    }

    @AfterAll
    static void tearDown() {
        threeSumClosestSolver = null;
    }
}
