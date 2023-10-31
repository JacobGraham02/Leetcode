package com.jacobdgraham.codesignal.InterviewPractice.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FirstDuplicateTest {

    private static FirstDuplicate firstDuplicate; 

    @BeforeAll
    final static void setUp() {
        firstDuplicate = new FirstDuplicate();
    }

    @Test
    final void testInputForRegularArray() {
        final int[] arrayNums = new int[]{2,1,3,5,3,2};
        final int expectedResult = 3;
        final int actualResult = firstDuplicate.firstDuplicateSolution(arrayNums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    final void testInputForEmptyArray() {
        final int[] arrayNumsEmpty = new int[0];
        final int expectedResult = -1;
        final int actualResultArrayEmpty = firstDuplicate.firstDuplicateSolution(arrayNumsEmpty);
        assertEquals(expectedResult, actualResultArrayEmpty);
    }

    @Test
    final void testInputForNullArray() {
        final int[] arrayNumsNull = null;
        final int expectedResult = -1;
        final int actualResultArrayNull = firstDuplicate.firstDuplicateSolution(arrayNumsNull);
        assertEquals(expectedResult, actualResultArrayNull);
    }

    @AfterAll
    final static void tearDown() {
        firstDuplicate = null;
    }
}
