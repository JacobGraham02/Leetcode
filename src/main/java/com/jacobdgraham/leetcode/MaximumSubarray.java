package com.jacobdgraham.leetcode;

/*
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:
    Input: nums = [1]
    Output: 1
    Explanation: The subarray [1] has the largest sum 1.
Example 3:
    Input: nums = [5,4,-1,7,8]
    Output: 23
    Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

Constraints:
    1 <= nums.length <= 105
    -104 <= nums[i] <= 104

 
Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public final class MaximumSubarray {
    

    public final int maxSubarrayIterative(final int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maximumCurrentArrayElement = nums[0];
        int maximumArraySum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maximumCurrentArrayElement = Math.max(nums[i], maximumCurrentArrayElement+nums[i]);
            maximumCurrentArrayElement = Math.max(maximumArraySum, maximumCurrentArrayElement);
        }
        return maximumArraySum;
    }

    public final int maxSubarrayDynamicProgramming(final int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int[] maxSumEndingHere = new int[nums.length];
        maxSumEndingHere[0] = nums[0];
        int maximumArraySum = nums[0];
    
        for (int i = 1; i < nums.length; i++) {
            maxSumEndingHere[i] = Math.max(nums[i], maxSumEndingHere[i - 1] + nums[i]);
            maximumArraySum = Math.max(maximumArraySum, maxSumEndingHere[i]);
        }
        
        return maximumArraySum;
    }
}
