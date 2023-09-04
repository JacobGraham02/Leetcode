package com.jacobdgraham.dailycodingproblem.DailyCodingProblem3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class dailycodingproblem3test {
    private static DailyCodingProblem3 dailyCodingProblem3;


    @BeforeAll
    static void setUp() {
        dailyCodingProblem3 = new DailyCodingProblem3();
    }

    @Test
    final void testNormalStringArrayForPalindromicIndices() {
        final ArrayList<String> input = new ArrayList<String>();
        input.add("code");
        input.add("edoc");
        input.add("da");
        input.add("d");
        final List<String> expected_output = new ArrayList<String>();
        expected_output.add("(0,1)");
        expected_output.add("(1,0)");
        expected_output.add("(2,3)");
        final ArrayList<String> actual_output = dailyCodingProblem3.indicesOfConcatenatedPalindromes(input);
        assertEquals(expected_output, actual_output);
    }

    @AfterAll
    final void tearDown() {
        dailyCodingProblem3 = null;
    } 
}
