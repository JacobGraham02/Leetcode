package com.jacobdgraham.leetcode;

/**
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

 

Constraints:

    1 <= nums.length <= 105
    nums[i] is either 0 or 1.
    0 <= k <= nums.length


 */
public class MaxConsecutiveOnesIII {

    /**
     * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

 

Constraints:

    1 <= nums.length <= 105
    nums[i] is either 0 or 1.
    0 <= k <= nums.length


     * @param nums array of binary digits
     * @param k maximum number of zeroes in subarray
     * @return maximum number of consecutive 1's in binary digit array that can have at most k 0's flipped 
     */
    public int longestOnes(int[] nums, int k) {
        int windowStart = 0;
        int maxOnesCount = 0;
        int maxLength = 0;

        // Expand the window by moving 'windowEnd' to the right
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            // Count the number of 1s in the current window
            if (nums[windowEnd] == 1) {
                maxOnesCount++;
            }

            // If the number of 0s (window size minus number of 1s) is more than 'k', shrink the window
            if ((windowEnd - windowStart + 1 - maxOnesCount) > k) {
                if (nums[windowStart] == 1) {
                    maxOnesCount--;
                }
                windowStart++; // shrink the window
            }

            // Calculate the maximum length of the window that satisfies the condition
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
