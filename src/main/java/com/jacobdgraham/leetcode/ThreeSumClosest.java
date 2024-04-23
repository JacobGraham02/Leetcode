package com.jacobdgraham.leetcode;

import java.util.Arrays;

/**
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.


Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

 
Constraints:
    3 <= nums.length <= 500
    -1000 <= nums[i] <= 1000
    -104 <= target <= 104
 */
public class ThreeSumClosest {
    
    /**
     * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers.
     * You may assume that each input would have exactly one solution.
     * @param nums an array of integers
     * @param target an integer
     * @return the sum of exactly three integers in the 'nums' input integer array that are closest to 'target' or is equal to 'target'
     */
    public int threeSumClosest(int[] nums, int target) {
        /*
        Like in the 3Sum problem, we can use the '2 pointers' strategy, although ours includes 3 pointers.
        We are given the target number as a parameter, so we do not have to explicitly define it
        We can set the first two pointers to be the first and second integers in the array, respectively. The last pointer can be at the last element in the array. We only have to store one input, as there exists only one solution. 
        We should use a for loop to iterate from the first element in the array to the 3rd-last element in the array
        */
        Arrays.sort(nums);
        /*
        We must first deal with the case if the array values are all 0
        */
        int initialSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == target) {
                    return sum;
                }

                /*
                We must first use positive integers to see the difference between the target number and the sum acquired from the list of integers
                */
                if (Math.abs(target-sum) < Math.abs(target-initialSum)) {
                    initialSum = sum;
                }

                /*
                If the sum of the three numbers we are using to calculate the total sum of the three numbers is lower than the target number we are looking for, we increment the leftmost pointer forwards to get a larger number.
                Else, we decrement the rightmost pointer backwards to get a smaller number. 
                */
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }   
        return initialSum;
    }
}
