package com.jacobdgraham.codesignal.InterviewPractice.Arrays;

/**
 * Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for which the second occurrence has the minimal index. 
 * In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence has a smaller index than the second occurrence of the other 
 * number does. If there are no such elements, return -1.

Example
    For a = [2, 1, 3, 5, 3, 2], the output should be solution(a) = 3.

    There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than the second occurrence of 2 does, so the answer is 3.

    For a = [2, 2], the output should be solution(a) = 2;

    For a = [2, 4, 3, 5, 1], the output should be solution(a) = -1.

 */
public final class FirstDuplicate {
    
    final int firstDuplicateSolution(int[] array) {
        if (array == null) {
            return -1;
        }
        if (array.length == 0) {
            return -1;
        }
        // Create an array 'seen' to keep track of numbers and their indices.
        // The size of the 'seen' array is one more than the length of input array 'a'.
        // Index 0 will not be used, as numbers in 'a' are in the range from 1 to 'a.length'.
        final int[] seen = new int[array.length + 1]; 
            
        // Iterate through the input array 'a'.
        for (int i = 0; i < array.length; i++) {
            int num = array[i]; // Get the current number from 'a'.
                
            // Check if we've seen this number before by examining 'seen[num]'.
            // If 'seen[num]' is greater than 0, it means we've seen this number before.
            if (seen[num] > 0) {
                return num; // Found a duplicate, return it.
            }
                
            // Record the index of the current number in the 'seen' array.
            // We set 'seen[num]' to 'i + 1' to avoid confusion with index 0.
            seen[num] = i + 1;
        }
            
        // If the loop completes without finding a duplicate, return -1.
        return -1; 
    } 
}
