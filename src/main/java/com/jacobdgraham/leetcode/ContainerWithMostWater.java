package com.jacobdgraham.leetcode;

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water. Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 *
 * Example 1:
 *  Input: height = [1,8,6,2,5,4,8,3,7]
 *  Output: 49
 *  Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 *
 * Example 2:
 *  Input: height = [1,1]
 *  Output: 1
 *
 * Constraints:
 *  n == height.length
 *  2 <= n <= 105
 *  0 <= height[i] <= 104
 */
public class ContainerWithMostWater {
    
    public final int maxArea(final int[] height) {
        int left_side_pointer = 0;
        int right_side_pointer = height.length - 1;
        int maximum_container_size = 0;

        while (left_side_pointer < right_side_pointer) {
            int container_width = right_side_pointer - left_side_pointer;
            int container_height = Math.min(height[left_side_pointer], height[right_side_pointer]);
            int container_area = container_width * container_height;
            maximum_container_size = Math.max(maximum_container_size, container_area);
            if (height[left_side_pointer] < height[right_side_pointer]) {
                left_side_pointer++;
            } else if (height[left_side_pointer] > height[right_side_pointer]) {
                right_side_pointer--;
            } else {
                left_side_pointer++;
                right_side_pointer--;
            }
        }
        return maximum_container_size;
    }
}
