package com.jacobdgraham.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LargestAltitudeTest {
    private final LargestAltitude calculator = new LargestAltitude();

    @Test
    public void testLargestAltitudeWithNegativeGains() {
        int[] gains = {-100, -200, -300, -400};
        int expected = 0; // The highest point is the starting point 0, never goes above it
        assertEquals(expected, calculator.largestAltitude(gains));
    }

    @Test
    public void testLargestAltitudeWithNoGain() {
        int[] gains = {0, 0, 0, 0};
        int expected = 0; // No gain, stays at 0
        assertEquals(expected, calculator.largestAltitude(gains));
    }

    @Test
    public void testLargestAltitudeWithMixedGains() {
        int[] gains = {50, -20, 30, -10};
        int expected = 60; // The highest altitude point is 60 (50 - 20 + 30)
        assertEquals(expected, calculator.largestAltitude(gains));
    }

    @Test
    public void testLargestAltitudeWithAllIncreasingGains() {
        int[] gains = {10, 20, 30, 40};
        int expected = 100; // Sum of all gains 10 + 20 + 30 + 40
        assertEquals(expected, calculator.largestAltitude(gains));
    }
}
