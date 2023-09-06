package com.jacobdgraham.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BestTimeBuyAndSellTest {
    
    private static BestTimeBuyAndSellStock bestTimeBuyAndSellStock;

    @BeforeAll
    static final void setUp() {
        bestTimeBuyAndSellStock = new BestTimeBuyAndSellStock();
    }

    @Test
    final void testMaxProfitCanExist() {
        final int[] profit_array = new int[]{7,1,5,3,6,4};
        final int expected_result = 5;
        final int actual_output = bestTimeBuyAndSellStock.maxProfit(profit_array);
        assertEquals(expected_result, actual_output);
    }

    @Test
    final void testMaxProfitIsZero() {
        final int[] profit_array = new int[]{7,6,4,3,1};
        final int expected_result = 0;
        final int actual_output = bestTimeBuyAndSellStock.maxProfit(profit_array);
        assertEquals(expected_result, actual_output);
    }

    @AfterAll
    static final void tearDown() {
        bestTimeBuyAndSellStock = null;
    }
}
