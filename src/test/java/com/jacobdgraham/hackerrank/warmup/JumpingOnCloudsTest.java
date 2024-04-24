package com.jacobdgraham.hackerrank.warmup;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class JumpingOnCloudsTest {
    
    private final JumpingOnClouds jumpingOnClouds = new JumpingOnClouds();

    @Test
    public void testJumpingOnCloudsWithMinimumJumps() {
        List<Integer> clouds = Arrays.asList(0, 0, 0, 0, 0);
        int expectedJumps = 2; // Jumps: 0 -> 2 -> 4
        assertEquals(expectedJumps, jumpingOnClouds.jumpingOnClouds(clouds), "Jumps should be minimum possible.");
    }

    @Test
    public void testJumpingOnCloudsWithAvoidance() {
        List<Integer> clouds = Arrays.asList(0, 1, 0, 0, 0, 1, 0);
        int expectedJumps = 3; // Jumps: 0 -> 2 -> 4 -> 6
        assertEquals(expectedJumps, jumpingOnClouds.jumpingOnClouds(clouds), "Jumps should skip thunderclouds.");
    }

    @Test
    public void testJumpingOnCloudsWithNoJumps() {
        List<Integer> clouds = Arrays.asList(0);
        int expectedJumps = 0; // No jumps needed, already at the end.
        assertEquals(expectedJumps, jumpingOnClouds.jumpingOnClouds(clouds), "There should be no jumps if only one cloud.");
    }
}
