package com.jacobdgraham.leetcode.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IncreasingTripletSubsequenceTest {

    private final IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();

    @Test
    public void testExample1() {
        assertTrue(solution.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testExample2() {
        assertFalse(solution.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void testExample3() {
        assertTrue(solution.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }

    @Test
    public void testSingleElement() {
        assertFalse(solution.increasingTriplet(new int[]{1}));
    }

    @Test
    public void testTwoElements() {
        assertFalse(solution.increasingTriplet(new int[]{1, 2}));
    }

    @Test
    public void testIncreasingAndDecreasing() {
        assertTrue(solution.increasingTriplet(new int[]{1, 2, -1, -2, 5, 0, 4, 6}));
    }

    @Test
    public void testNoTriplets() {
        assertFalse(solution.increasingTriplet(new int[]{5, 4, 3}));
    }

    @Test
    public void testEdgeCaseLargeNumbers() {
        assertTrue(solution.increasingTriplet(new int[]{-231, 231, -1, 0, 231 - 1}));
    }
}
