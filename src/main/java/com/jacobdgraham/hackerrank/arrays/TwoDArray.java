package com.jacobdgraham.hackerrank.arrays;

import java.util.List;

/**
 * Given a 2D Array,

:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

An hourglass in
is a subset of values with indices falling in this pattern in

's graphical representation:

a b c
  d
e f g

There are
hourglasses in . An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum. The array will always be .
 */
public class TwoDArray {
    
    /**
     * Given a 2D Array,

:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

An hourglass in
is a subset of values with indices falling in this pattern in

's graphical representation:

a b c
  d
e f g

There are
hourglasses in . An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum. The array will always be .
     * https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
     * @param arr 2D array of integers
     * @return hourglass sum for every hourglass in arr
     */
    public final int hourglassSum(final List<List<Integer>> arr) {
        int maximumHourglassSum = Integer.MIN_VALUE;
        
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 4; col++) {
                // Calculate sum of hourglass
                final int hourglassSum = arr.get(row).get(col) // center
                                 + arr.get(row-1).get(col-1) // top left
                                 + arr.get(row-1).get(col) // top middle
                                 + arr.get(row-1).get(col+1) // top right
                                 + arr.get(row+1).get(col-1) // bottom left
                                 + arr.get(row+1).get(col) // bottom middle
                                 + arr.get(row+1).get(col+1); // bottom right
                maximumHourglassSum = Math.max(hourglassSum, maximumHourglassSum);
            }
        }
        return maximumHourglassSum;
    }
}
