package com.jacobdgraham.leetcode;

import java.util.Arrays;

/**
 * You are given an integer array nums and an integer k.

In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

Return the maximum number of operations you can perform on the array.

 

Example 1:

Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.

Example 2:

Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.

 

Constraints:

    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    1 <= k <= 109


 */
public class MaxNumberOfKSumPairs {
    
    /**
     * You are given an integer array nums and an integer k.

In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

Return the maximum number of operations you can perform on the array.

 

Example 1:

Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.

Example 2:

Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.

 

Constraints:

    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    1 <= k <= 109


     * @param nums int[] to search 
     * @param k the number we want a pair of integers in nums to equal to
     * @return how many pairs of integers in the array nums equals to k
     */
    public int maxNumberOfPairs(int[] nums, int k) {
        /**
         * The general strategy is to use 2 pointers to traverse inwards from both the left and right side of the array.
         * If the integers at the left- and right-hand pointers equal to our target integer, we will increment a variable to indicate this
         * If the pair of integers is less, we will increment the left pointer
         * If the pair of integers is more, we will decrement the right pointer
         */
        Arrays.sort(nums);
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int countOfPairs = 0;

        while (leftPointer < rightPointer) {
            int sum = nums[leftPointer] + nums[rightPointer];

            if (sum == k) {
                leftPointer++;
                rightPointer--;
                countOfPairs++;
            }
            else if (sum > k) {
                rightPointer--;
            } else {
                leftPointer++;
            }
        }
        return countOfPairs;
    }
}
