package com.jacobdgraham.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.MaxNumberOfKSumPairs;

public class MaxNumberOfKSumPairsTest {

    private final MaxNumberOfKSumPairs maxNumberOfKSumPairs = new MaxNumberOfKSumPairs();

    @Test
    public void testMaxOperationsMultiplePairs() {
        assertEquals(2, maxNumberOfKSumPairs.maxNumberOfPairs(new int[]{1, 2, 3, 4}, 5));
    }

    @Test
    public void testMaxOperationsNoPairs() {
        assertEquals(0, maxNumberOfKSumPairs.maxNumberOfPairs(new int[]{1, 5, 3, 4}, 10));
    }

    @Test
    public void testMaxOperationsEmptyArray() {
        assertEquals(0, maxNumberOfKSumPairs.maxNumberOfPairs(new int[]{}, 5));
    }

    @Test
    public void testMaxOperationsSinglePair() {
        assertEquals(1, maxNumberOfKSumPairs.maxNumberOfPairs(new int[]{4, 4}, 8));
    }

    @Test
    public void testMaxOperationsNoPossiblePairs() {
        assertEquals(0, maxNumberOfKSumPairs.maxNumberOfPairs(new int[]{2, 2, 2, 2, 2}, 9));
    }

    @Test
    public void testMaxOperationsAllElementsSamePairingPossible() {
        assertEquals(2, maxNumberOfKSumPairs.maxNumberOfPairs(new int[]{3, 3, 3, 3}, 6));
    }
}
