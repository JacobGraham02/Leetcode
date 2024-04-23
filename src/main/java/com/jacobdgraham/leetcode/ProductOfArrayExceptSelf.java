package com.jacobdgraham.leetcode;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Constraints:

    2 <= nums.length <= 105
    -30 <= nums[i] <= 30
    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

 */
public class ProductOfArrayExceptSelf {
    
    /**
     * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Constraints:

    2 <= nums.length <= 105
    -30 <= nums[i] <= 30
    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

     * @param nums int[] that represents the array of products we want to add up 
     * @return int[] such that int[i] is equal to the product of all elements of nums except nums[i]
     */
    public final int[] productExceptSelf(final int[] nums) {
        final int numsLength = nums.length;
        final int[] outputIntArray = new int[numsLength];
        
        /*
         * Assign the output array an initial value of 1; 1 is known as an empty value and can be stored initially
         * We can start looping at i = 1, because i = 0 already has a value of 1.
         */
        outputIntArray[0] = 1;
        for (int i = 1; i < numsLength; i++ ){
            outputIntArray[i] = outputIntArray[i-1] * nums[i-1];
        }

        int rightArrayProduct = 1;
        for (int i = numsLength - 1; i >= 0; i--) {
            outputIntArray[i] = outputIntArray[i] *= rightArrayProduct;
            rightArrayProduct *= nums[i];
        }
        return outputIntArray;
    }

    public final int[] productExceptSelfEasierToUnderstand(final int[] nums) {
        final int numsLength = nums.length;

        final int[] leftProducts = new int[numsLength];
        final int[] rightProducts = new int[numsLength];
        final int[] resultTotalProduct = new int[numsLength];

        leftProducts[0] = 1;
        rightProducts[numsLength-1] = 1;

        for (int i = 1; i < numsLength; i++) {
            leftProducts[i] = leftProducts[i-1] * nums[i-1];
        }
        
        for (int i = numsLength - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i+1] * nums[i+1];
        }

        for (int i = 0; i < numsLength; i++) {
            resultTotalProduct[i] = rightProducts[i] * leftProducts[i];
        }
        
        return resultTotalProduct;
    }
}
