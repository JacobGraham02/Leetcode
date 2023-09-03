package com.jacobdgraham.dailycodingproblem.DailyCodingProblem1;

/**
 * Given an array of integers, return a new array where each element in the new array is the number of smaller elements to the right of that
 * element in the original input array
 * 
 * For example, given the array [3,4,9,6,1], return [1,1,2,1,0] because of the following:
 *  1. There is 1 smaller element to the right of 3
 *  2. There is 1 smaller element to the right of 4
 *  3. There are 2 smaller elements to the right of 9
 *  4. There is 1 smaller element to the right of 6
 *  5. There are no smaller elements to the right of 1
 */
public final class DailyCodingProblem1 {
    
   /**
     * Given an array of integers, return a new array where each element in the new array is the number of smaller elements to the right of that
     * element in the original input array
     * 
     * For example, given the array [3,4,9,6,1], return [1,1,2,1,0] because of the following:
     *  1. There is 1 smaller element to the right of 3
     *  2. There is 1 smaller element to the right of 4
     *  3. There are 2 smaller elements to the right of 9
     *  4. There is 1 smaller element to the right of 6
     *  5. There are no smaller elements to the right of 1
    */
    public final int[] smallestElements(final int[] int_input_array) {

        int[] result_array = new int[int_input_array.length];
        int input_array_length = int_input_array.length;

        for (int i = 0; i < input_array_length; i++) {
            int target_number = int_input_array[i];

            for (int j = i + 1; j < input_array_length; j++) {
                int other_smaller_number = int_input_array[j];
                if (other_smaller_number < target_number) {
                    result_array[i]++;
                }
            }
        }
        return result_array;
    }
}
