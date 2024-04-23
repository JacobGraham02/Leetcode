package com.jacobdgraham.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesIIITest {

    private final MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();

    @Test
    public void testLongestOnesExample1() {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int expected = 6;
        int actual = solution.longestOnes(nums, k);
        assertEquals(expected, actual, "The longest consecutive ones with at most 2 flips should be 6.");
    }

    @Test
    public void testLongestOnesExample2() {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        int expected = 10;
        assertEquals(expected, solution.longestOnes(nums, k), "The longest consecutive ones with at most 3 flips should be 10.");
    }

    @Test
    public void testLongestOnesWithZeroK() {
        int[] nums = {0,1,1,0,0,1,1,0,1};
        int k = 0;
        int expected = 2;
        assertEquals(expected, solution.longestOnes(nums, k), "The longest consecutive ones with no flips should be 2.");
    }

    @Test
    public void testLongestOnesAllZeros() {
        int[] nums = {0,0,0,0};
        int k = 2;
        int expected = 2;
        assertEquals(expected, solution.longestOnes(nums, k), "The longest consecutive ones in all zeros array with 2 flips should be 2.");
    }

    @Test
    public void testLongestOnesAllOnes() {
        int[] nums = {1,1,1,1};
        int k = 1;
        int expected = 4;
        assertEquals(expected, solution.longestOnes(nums, k), "The longest consecutive ones in all ones array should be 4.");
    }
}
