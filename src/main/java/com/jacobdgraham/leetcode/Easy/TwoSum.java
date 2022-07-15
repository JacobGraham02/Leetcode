package com.jacobdgraham.leetcode.Easy;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> numsHashMap = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            int differenceBetweenTargetAndNum = target - nums[i];
            if (numsHashMap.containsKey(differenceBetweenTargetAndNum)) {
                return new int[] {numsHashMap.get(differenceBetweenTargetAndNum),i};
            }
            numsHashMap.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum twoSumObj = new TwoSum();
        int nums[] = {2,7,11,15};
        int targetNum = 9;

        int resultArray[] = twoSumObj.twoSum(nums,targetNum);
        System.out.println(Arrays.toString(resultArray));
    }
}