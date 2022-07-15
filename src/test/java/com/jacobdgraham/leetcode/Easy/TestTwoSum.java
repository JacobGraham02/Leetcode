package com.jacobdgraham.leetcode.Easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class TestTwoSum {
    private final TwoSum twoSum = new TwoSum();

    @Test
    void testTwoSumTwoNumsAddUpToTarget() {
        int nums[] = {2,7,11,15};
        int targetNum = 9;
        int targetResultArray[] = {0,1};
        int twoSumArrayResult[] = twoSum.twoSum(nums, targetNum);
        assertEquals(targetResultArray[0] + "," + targetResultArray[1], twoSumArrayResult[0] + "," + twoSumArrayResult[1]);
    }
}
