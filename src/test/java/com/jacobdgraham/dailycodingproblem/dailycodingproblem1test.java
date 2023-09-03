package com.jacobdgraham.dailycodingproblem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.dailycodingproblem.DailyCodingProblem1.DailyCodingProblem1;

public class dailycodingproblem1test {
    private static DailyCodingProblem1 dailyCodingProblem1;

    @BeforeAll
    static final void setUp() {
        dailyCodingProblem1 = new DailyCodingProblem1();
    }

    @Test
    final void testRegularArrayAllElementsToRightAreSmaller() {
        final int[] target_array = new int[]{3,4,9,6,1};
        final int[] expected_output_array = new int[]{1,1,2,1,0};
        final int[] actual_output_array = dailyCodingProblem1.smallestElements(target_array);
        assertArrayEquals(expected_output_array, actual_output_array);
    }

    @AfterAll
    static final void tearDown() {
        dailyCodingProblem1 = null;
    }
}
