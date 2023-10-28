package com.jacobdgraham.codesignal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CoverDebtsTests {
    
    private static CoverDebts coverDebts;
    
    @BeforeAll
    final static void setUp() {
        coverDebts = new CoverDebts();
    }

    @Test
    final void testDebtsWithSmallArray() {
        final double[] debts = new double[]{2,2,5};
        final int monthlySalary = 50;
        final double[] interests = new double[]{200, 100, 150};
        final double expectedResult = 22;
        final double actualResult = coverDebts.coverDebtsBruteForce(monthlySalary, debts, interests);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    final void testDebtsWithLargeArray() {
        final double[] debts = new double[]{5,2,6,3,1,9,7,8,4};
        final int monthlySalary = 4007;
        final double[] interests = new double[]{300, 500, 850, 200, 900, 150, 700, 400, 600};
        final double expectedResult = 45;
        final double actualResult = coverDebts.coverDebtsBruteForce(monthlySalary, debts, interests);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    final void testNullDebtsAndSalaryOfZeroDollars() {
        final double[] debts = null;
        final int monthlySalary = 0;
        final double[] interests = new double[]{200, 100};
        final double expectedResult = 0.0;
        final double actualResult = coverDebts.coverDebtsBruteForce(monthlySalary, debts, interests);
        assertEquals(expectedResult, actualResult);
    }

    @AfterAll
    final static void tearDown() {
        coverDebts = null;
    }
}
