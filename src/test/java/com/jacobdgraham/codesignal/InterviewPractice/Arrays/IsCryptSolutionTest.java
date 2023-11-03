package com.jacobdgraham.codesignal.InterviewPractice.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class IsCryptSolutionTest {
    
    private static IsCryptSolution isCryptSolution;

    @BeforeAll
    final static void setUp() {
        isCryptSolution = new IsCryptSolution();
    }

    @Test
    final void testRegularCryptWithSolutions() {
        final String[] crypt = {"SEND", "MORE", "MONEY"};
        final char[][] solution = {
            {'O', '0'},
            {'M', '1'},
            {'Y', '2'},
            {'E', '5'},
            {'N', '6'},
            {'D', '7'},
            {'R', '8'},
            {'S', '9'}
        };
        final boolean expectedValue = true;
        final boolean actualValue = isCryptSolution.solution(crypt, solution);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    final void testInvalidCryptWhenIsEmpty() {
        final String[] crypt = {};
        final char[][] solution = {
            {'O', '0'},
            {'M', '1'},
            {'Y', '2'},
            {'E', '5'},
            {'N', '6'},
            {'D', '7'},
            {'R', '8'},
            {'S', '9'}
        };
        final boolean expectedValue = false;
        final boolean actualValue = isCryptSolution.solution(crypt, solution);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    final void testInvalidCryptWhenIsNull() {
        final String[] crypt = null;
        final char[][] solution = {
            {'O', '0'},
            {'M', '1'},
            {'Y', '2'},
            {'E', '5'},
            {'N', '6'},
            {'D', '7'},
            {'R', '8'},
            {'S', '9'}
        };
        final boolean expectedValue = false;
        final boolean actualValue = isCryptSolution.solution(crypt, solution);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    final void testInvalidCryptWhenSolutionIsNull() {
        final String[] crypt = {"SEND", "MORE", "MONEY"};
        final char[][] solution = null;
        final boolean expectedValue = false;
        final boolean actualValue = isCryptSolution.solution(crypt, solution);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    final void testInvalidCryptWhenSolutionIsEmpty() {
        final String[] crypt = null;
        final char[][] solution = {};
        final boolean expectedValue = false;
        final boolean actualValue = isCryptSolution.solution(crypt, solution);
        assertEquals(expectedValue, actualValue);
    }

    @AfterAll
    final static void tearDown() {
        isCryptSolution = null;
    }
}
