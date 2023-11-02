package com.jacobdgraham.codesignal.InterviewPractice.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RotateImageSolutionTest {
    
    private static RotateImage rotateImage;

    @BeforeAll
    final static void setUp() {
        rotateImage = new RotateImage();
    }

    @Test
    final void testRegularMatrixReversal() {
        final int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        final int[][] expectedResult = {{7,4,1},{8,5,2},{9,6,3}};
        final int[][] actualOutput = rotateImage.rotateImageSolution(matrix);
        assertArrayEquals(expectedResult, actualOutput);
    }

    @Test
    final void testNullMatrixReturnsOriginalMatrix() {
        final int[][] matrix = null;
        final int[][] expectedResult = null;
        final int[][] actualOutput = rotateImage.rotateImageSolution(matrix);
        assertArrayEquals(expectedResult, actualOutput);
    }

    @Test
    final void testEmptyMatrixReturnsOriginalMatrix() {
        final int[][] matrix = new int[0][0];
        final int[][] expectedResult = {};
        final int[][] actualOutput = rotateImage.rotateImageSolution(matrix);
        assertArrayEquals(expectedResult, actualOutput);
    }

    @AfterAll
    final static void tearDown() {
        rotateImage = null;
    }
}
