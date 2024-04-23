package com.jacobdgraham.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.ThreeSum;

import java.util.Arrays;
import java.util.List;

public class ThreeSumTest {

    private final ThreeSum threeSumSolver = new ThreeSum();

    @Test
    public void testNormalArrayCases() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-1, -1, 2),
            Arrays.asList(-1, 0, 1)
        );
        assertTripletsEqual(expected, threeSumSolver.threeSum(nums));
    }

    @Test
    public void testNoValidTriplets() {
        int[] nums = {0, 1, 1};
        List<List<Integer>> expected = Arrays.asList();
        assertTripletsEqual(expected, threeSumSolver.threeSum(nums));
    }

    @Test
    public void testAllZeros() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(0, 0, 0)
        );
        assertTripletsEqual(expected, threeSumSolver.threeSum(nums));
    }

    @Test
    public void testLargeInput() {
        int[] nums = new int[3000];
        Arrays.fill(nums, 0);
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(0, 0, 0)
        );
        assertTripletsEqual(expected, threeSumSolver.threeSum(nums));
    }

    // Utility method to assert equality of triplets while ignoring order
    private void assertTripletsEqual(List<List<Integer>> expected, List<List<Integer>> actual) {
        assertEquals(expected.size(), actual.size(), "The number of triplets does not match");
        for (List<Integer> triplet : expected) {
            assertTrue(actual.stream().anyMatch(a -> a.containsAll(triplet) && triplet.containsAll(a)),
                       "Expected triplet not found: " + triplet);
        }
    }
}
