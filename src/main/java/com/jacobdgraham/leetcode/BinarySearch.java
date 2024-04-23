package com.jacobdgraham.leetcode;

/**
 *   Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. 
 * If target exists, then return its index. Otherwise, return -1.
 *
 *   You must write an algorithm with O(log n) runtime complexity.
 *
 *   Example 1:
 *       Input: nums = [-1,0,3,5,9,12], target = 9
 *       Output: 4
 *       Explanation: 9 exists in nums and its index is 4
 *
 *   Example 2:
 *       Input: nums = [-1,0,3,5,9,12], target = 2
 *       Output: -1
 *       Explanation: 2 does not exist in nums so return -1
 *
 *
 *   Constraints:
 *       1 <= nums.length <= 104
 *       -104 < nums[i], target < 104
 *       All the integers in nums are unique.
 *       nums is sorted in ascending order.
 */
public final class BinarySearch {
    
    /**
     * A manual implementation of the typical binary search algorithm is here. An iterative method is used instead of recursion to simplify the logic.
     * May be less efficient than the Java standard library binary search in both time and space complexity
     * @param nums an array of integers sorted ascendingly
     * @param target the target number we are searching for in the array
     * @return the position in the array where 'target' integer is located
     */
    public final int searchIterative(final int[] nums, final int target) {
        int highest_pointer = nums.length - 1;
        int lowest_pointer = 0;

        while (lowest_pointer <= highest_pointer) {
            int middle_pointer = lowest_pointer + (highest_pointer - lowest_pointer) / 2;

            if (nums[middle_pointer] == target) {
                return middle_pointer;
            }
            if (nums[middle_pointer] < target) {
                lowest_pointer = middle_pointer + 1;
            }
            if (nums[middle_pointer] > target) {
                highest_pointer = middle_pointer - 1;
            }
        }
        return -1;
    }

    /**
     * A manual implementation of the typical binary search algorithm using recursion. May be less efficient than the Java standard library binary search
     * for both time and space complexity. 
     * @param nums an array of integers sorted ascendingly
     * @param target the target number we are searching for in the array
     * @param lowest_pointer the lowest pointer in the list we will be searching (e.g. if the list is [0,9,8,7], lowest_pointer will initially be zero before any reassignments)
     * @param highest_pointer the highest pointer in the list we will be searching (e.g. if the lsit is [0,9,8,7], the highest_pointer will initially be 3 before any reassignments)
     * @return the position in the array where 'target' integer is located
     */
    public final int searchRecursion(int[] nums, final int target, int lowest_pointer, int highest_pointer) {
        if (lowest_pointer <= highest_pointer) {
            int middle_pointer = lowest_pointer + (highest_pointer - lowest_pointer) / 2;

            if (nums[middle_pointer] == target) {
                return middle_pointer;
            }

            if (nums[middle_pointer] < target) {
                return searchRecursion(nums, target, middle_pointer + 1, highest_pointer);
            }
            if (nums[middle_pointer] > target) {
                return searchRecursion(nums, target, lowest_pointer, middle_pointer - 1);
            }
        }
        return -1;
    }
}


