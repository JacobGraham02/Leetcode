package com.jacobdgraham.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroesTest {

    private final ZeroMover zeroMover = new ZeroMover();

    @Test
    public void testMoveZeroesWithMixedZeroes() {
        int[] nums = {0, 1, 0, 3, 12};
        zeroMover.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    public void testMoveZeroesWithNoZero() {
        int[] nums = {1, 2, 3, 4};
        zeroMover.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 3, 4}, nums); // Expect no change
    }

    @Test
    public void testMoveZeroesWithAllZeroes() {
        int[] nums = {0, 0, 0, 0};
        zeroMover.moveZeroes(nums);
        assertArrayEquals(new int[]{0, 0, 0, 0}, nums); // Expect no change in the array content, just confirmation it handles all zeroes
    }

    @Test
    public void testMoveZeroesWithZerosAtStart() {
        int[] nums = {0, 0, 1, 2, 3};
        zeroMover.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 3, 0, 0}, nums);
    }

    @Test
    public void testMoveZeroesWithZerosAtEnd() {
        int[] nums = {1, 2, 3, 0, 0};
        zeroMover.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 3, 0, 0}, nums); // Expect no change as zeros are already at the end
    }

    @Test
    public void testMoveZeroesEmptyArray() {
        int[] nums = {};
        zeroMover.moveZeroes(nums);
        assertArrayEquals(new int[]{}, nums); // Expect no change on empty array
    }

    // Utility class containing the moveZeroes method
    public static class ZeroMover {
        public void moveZeroes(int[] nums) {
            if (nums == null || nums.length == 0) {
                return; 
            }

            int numberInsertPosition = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[numberInsertPosition] = nums[i];
                    if (i != numberInsertPosition) { // Avoids overwriting the same value
                        nums[i] = 0;
                    }
                    numberInsertPosition++;
                }
            }
        }
    }
}
