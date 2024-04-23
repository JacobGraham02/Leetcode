package com.jacobdgraham.leetcode;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    
    public int[][] insert(int[][] intervals, int[] newInterval) {
        final List<int[]> outputResult = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            /*
             * Three conditions we need to account for:
             * 1. Inserting the new interval does not cause any issues, so insert it
             * 2. If the current interval starts after the new interval ends, we have passed over the insertion point that we want for the new interval.  
             * 3. There is overlap between the current and new interval. We must merge them by updating the start index to the minimum of both intervals, 
             * and the end index to the maximum of both intervals.
             */
            if (intervals[i][1] < newInterval[0]) {
                outputResult.add(intervals[i]);

            /*
             * If the interval we are on begins after newInterval ends, we have passed over the insertion point we want. Because of this, we will immediately add the newResult 
             * to the list. All previous intervals have already been processed. The variable newInterval effectively becomes the 'new' interval to be considered in subsequent 
             * iterations because newInterval was added as the most recently added interval. 
             */
            } else if (intervals[i][0] > newInterval[1]) {
                outputResult.add(newInterval);
                newInterval = intervals[i];
            
            /*
             * If there is overlap between the interval[i] and newInterval, we must get the minimum value of the first array location in interval[i] and newInterval, and the
             * maximum value of the second array location in interval[i] and newInterval. Because the problem explicitly states newInterval as being inserted into the list,
             * we will assign these new values to newInterval. 
             */
            } else {
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }           
        }
        outputResult.add(newInterval);
        
        return outputResult.toArray(new int[outputResult.size()][2]);
    }
}
