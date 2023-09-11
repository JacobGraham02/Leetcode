package com.jacobdgraham.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public final class BinarySearchTest {
    
    static BinarySearch binarySearch;

    @BeforeAll
    final static void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    final void testBinarySearchArrayWithIteration() {
        final int nums[] = new int[]{-1,0,3,5,9,12};
        final int target_integer = 9;
        final int expected_output = 4;
        final int actual_output = binarySearch.searchIterative(nums, target_integer);
        assertEquals(expected_output, actual_output);
    }

    @Test
    final void testBinarySearchWithRecursion() {
        final int nums[] = new int[]{-1,0,3,5,9,12};
        final int target_integer = 9;
        final int expected_output = 4;
        final int lowest_pointer = 0;
        final int highest_pointer = nums.length - 1;
        final int actual_output = binarySearch.searchRecursion(nums, target_integer, lowest_pointer, highest_pointer);
        assertEquals(expected_output, actual_output);
    }

    @Test
    final void testBinarySearchCannotFindIntegerIteration() {
         final int nums[] = new int[]{-1,0,3,5,9,12};
        final int target_integer = 15;
        final int expected_output = -1;
        final int actual_output = binarySearch.searchIterative(nums, target_integer);
        assertEquals(expected_output, actual_output);
    }

    @Test
    final void testBinarySearchCannotFindIntegerRecursion() {
        final int nums[] = new int[]{-1,0,3,5,9,12};
        final int target_integer = 27;
        final int expected_output = -1;
        final int lowest_pointer = 0;
        final int highest_pointer = nums.length - 1;
        final int actual_output = binarySearch.searchRecursion(nums, target_integer, lowest_pointer, highest_pointer);
        assertEquals(expected_output, actual_output);
    }

    @AfterAll
    final static void tearDown() {
        binarySearch = null;
    }
}
