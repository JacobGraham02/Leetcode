package com.jacobdgraham.leetcode;

/**
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.

Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.

Example 3:

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.

 

Constraints:

    1 <= nums.length <= 5 * 105
    -231 <= nums[i] <= 231 - 1

 */
public class IncreasingTripletSubsequence {

    /**
     * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

 

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.

Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.

Example 3:

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.

Constraints:

    1 <= nums.length <= 5 * 105
    -231 <= nums[i] <= 231 - 1

     * @param nums int[] integer array of numbers we use to search for a triplet 
     * @return true if a triplet exists that contains integers i, j, k such that the rule i < j < k is satisfied. False otherwise
     */
    public boolean increasingTriplet(int[] nums) {
        /*
        Because we are dealing with three numbers (definitions of a triplet of numbers), such that
        i < k < j, we must initialize three variables: i, j, and k. 
        i will be the smallest integer, j will be the middle integer, and k the largest integer
        We do not need to explicitly define k, as the largest integer is implicitly
        defined as the number we will be using to iterate over the array of integers
        The return value of the function depends on k. 
        */
        int smallestIntegerValue = Integer.MAX_VALUE;
        int middleIntegerValue = Integer.MAX_VALUE;

        /*
        If k <= i, then we assign k to i to set the smallest integer
        If k <= j, then we assign k to j to set the integer value smaller than k but larger than i
        If k >= i and k >= j, then we return true as we have found a triplet that meets the requirements i < j < k
        */
        for (final int number : nums) {
            if (number <= smallestIntegerValue) {
                smallestIntegerValue = number;
            } 
            else if (number <= middleIntegerValue) {
                middleIntegerValue = number;
            } else {
                return true;
            }
        }
        return false;
    }
}
