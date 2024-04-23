package com.jacobdgraham.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

 

Constraints:

    3 <= nums.length <= 3000
    -105 <= nums[i] <= 105
 */
public final class ThreeSum {

    
    /**
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0
     * Notice that the solution set must not contain duplicate triplets.
     * @param nums array of integers
     * @return List<List<Integer>> containing all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0
     */
    public List<List<Integer>> threeSum(int[] nums) {
        final int targetInteger = 0;
        Arrays.sort(nums);
        final List<List<Integer>> output = new ArrayList<>();
        /*
        Because we need three variables (i, j, k), we can iterate from 0 to nums.length - 2 to ensure no index out of bounds
        errors occur. 
        */
        for (int i = 0; i < nums.length-2; i++) {
            /*
            We must skip any duplicate values in the original integer array. This is a requirement for the 3Sum problem.
            No triplet can have any duplicate integer values
            */
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            /*
            The k variable is pointed to the last element of the array because of the 'two pointer' strategy. 
            This strategy involves having a pointer at both the start and end of the array and move towards one another.
            */
            int j = i + 1;
            int k = nums.length - 1;

            /*
            While the leftmost pointer does not overtake the rightmost pointer
            */
            while (j < k) {
                final int sum = nums[i] + nums[j] + nums[k];
                /*
                Each time that the sum is equal to 0, we must increment the pointer to j, and decrement the pointer to k
                */
                if (sum ==targetInteger) {
                    output.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    /*
                    We must use two while loops to ensure that the values that are next to j-1 and k+1 are not duplicate values
                    */
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    } 

                /*
                If the sum of all the array integers is less than 0, we must increment the leftmost counter and get a largest value. Because the array is sorted, the next largest value will be the next location from variablee j. The same logic applies for k, whereby we get smaller values as the array index location gets smaller. 
                */
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return output;
    }
}
