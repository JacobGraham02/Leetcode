package com.jacobdgraham.leetcode;

public class MaximumAverageSubarray1 {

    public final double findMaxAverage(final int[] nums, final int k) {
        if (nums.length == 1) {
            return (double) nums[0];
        }

        int startSlidingWindowLocation = 0;
        int endSlidingWindowLocation = k;
        double averageNumberInSlidingWindow = 0;
        double slidingWindowMaximumValue = 0;

        /*
        Calculate the initial average of the first k elements to determine the initial maximum value of the sliding window
        */
        for (int i = 0; i < k; i++) {
            averageNumberInSlidingWindow = averageNumberInSlidingWindow + (double) nums[i] / k;
        }

        slidingWindowMaximumValue = averageNumberInSlidingWindow;

        while (endSlidingWindowLocation < nums.length) {
            /*
            While you are iterating over the entire array during the while loop, you can effectively 'move' the sliding
            window when moving the pointers by subtracting the value at the window starting pointer from the maximum
            average, while adding the value at the window ending pointer to the maximum average. Each of the added
            values must be divided by k as per the algorithm rules. 
            */
            averageNumberInSlidingWindow = averageNumberInSlidingWindow - (double) nums[startSlidingWindowLocation++] / k;
            averageNumberInSlidingWindow = averageNumberInSlidingWindow + (double) nums[endSlidingWindowLocation++] / k;

            /*
            After have assigned values to the average number in sliding window, we must take the maximum value from
            the calculated average number and the initial sliding window value that we calculated previously
            */
            slidingWindowMaximumValue = Math.max(averageNumberInSlidingWindow, slidingWindowMaximumValue);
        }
        return slidingWindowMaximumValue;
    }

    public final double findMaxAverageSubarrayOptimized(final int[] nums, final int k) {
        double slidingWindowMaximumSum = 0;

        /*
         * Calculate the sum of the first k elements in the nums array to determine if maximum average can be obtained in O(1) runtime
         */
        for (int i = 0; i < k; i++) {
            slidingWindowMaximumSum += nums[i];
        }

        /*
         * Calculate the sliding window maximum average by dividing the total sum by the value k
         */
        double slidingWindowMaximumAverage = slidingWindowMaximumSum / k;

        /*
         * Start the sliding window index from 1
         */
        for (int i = k; i < nums.length; i++) {
            /*
             * Add the current ith element to the sliding window maximum sum and subtract the (i - k)th element. We do this because when we want to move the sliding window pointer
             * forwards by 1, the value that was at the old end pointer location is still used, therefore requiring us to remove that value to preserve the integrity of the algorithm.
             */
            slidingWindowMaximumSum += nums[i] - nums[i - k];
            // Update maxAverage if a new maximum average is found
            /*
             * If a new maximum average is found by performing the above operations that is greater than the sliding window sum divided by k, we must assign that 
             * value to the sliding window maximum average, allowing us to eventually get the sliding window of size k which has the largest average. 
             */
            slidingWindowMaximumAverage = Math.max(slidingWindowMaximumAverage, slidingWindowMaximumSum / k);
        }

        return slidingWindowMaximumAverage;
    }
}
