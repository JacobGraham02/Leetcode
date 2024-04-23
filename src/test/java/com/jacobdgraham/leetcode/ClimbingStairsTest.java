package com.jacobdgraham.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.ClimbingStairs;

/**
Example 1:
    Input: n = 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps

Example 2:
    Input: n = 3
    Output: 3
    Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step
 */
public class ClimbingStairsTest {
    
    private static ClimbingStairs climbingStairs;

    @BeforeAll
    final static void setUp() {
        climbingStairs = new ClimbingStairs();
    }

    @Test
    final void testClimbingStairsNIsThree() {
        final int numberOfStairs = 3;
        final int expectedOutput = 3;
        final int actualOutput = climbingStairs.climbStairs(numberOfStairs);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    final void testClimbingStairsNIsOne() {
        final int numberOfStairs = 1;
        final int expectedOutput = 1;
        final int actualOutput = climbingStairs.climbStairs(numberOfStairs);
        assertEquals(expectedOutput, actualOutput);
    }

    @AfterAll
    final static void tearDown() {
        climbingStairs = null;
    }
}
