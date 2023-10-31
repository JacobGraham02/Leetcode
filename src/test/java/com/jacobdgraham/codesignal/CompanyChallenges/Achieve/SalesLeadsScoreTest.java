package com.jacobdgraham.codesignal.CompanyChallenges.Achieve;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SalesLeadsScoreTest {
    
    private static SalesLeadsScore salesLeadsScore;

    @BeforeAll
    final static void setUp() {
        salesLeadsScore = new SalesLeadsScore();
    }

    @Test
    final void testSalesLeadsScoreOnNormalInputs() {
        final String[] names = new String[]{"lead1","lead2","lead3","lead4","lead5"};
        final int[] times = new int[]{250,300,250,260,310};
        final int[] netValues = new int[]{1000,800,1100,1200,1000};
        final boolean[] onVacation = new boolean[]{true,false,true,false,false};
        final String[] expectedResults = new String[]{"lead4","lead5","lead2"};
        final String[] actualResults = salesLeadsScore.solution(names, times, netValues, onVacation);
        assertArrayEquals(expectedResults, actualResults);
    }

    @Test
    final void testSalesLeadScoreOnRandomCharacterInputs() {
        final String[] names = new String[]{"aa","aab","aba","baa","baba","aabb","babb","baab","ba","aababa"};
        final int[] times = new int[]{0,50,50,160,320,220,300,160,55,65};
        final int[] netValues = new int[]{1000,2000,1200,1500,2000,1200,1200,1200,1700,1800};
        final boolean[] onVacation = new boolean[]{true, false, false, false, false, true, true, false, false, true};
        final String[] expectedResults = new String[]{"baba","baa","baab","aab","ba","aba"};
        final String[] actualResults = salesLeadsScore.solution(names, times, netValues, onVacation);
        assertArrayEquals(expectedResults, actualResults);
    }

    @Test
    final void testSalesLeadScoreOnNullSalesLeads() {
        final String[] names = new String[]{};
        final int[] times = new int[]{0,50,50,160,320,220,300,160,55,65};
        final int[] netValues = new int[]{1000,2000,1200,1500,2000,1200,1200,1200,1700,1800};
        final boolean[] onVacation = new boolean[]{true, false, false, false, false, true, true, false, false, true};
        final String[] expectedResults = null;
        final String[] actualResults = salesLeadsScore.solution(names, times, netValues, onVacation);
        assertArrayEquals(expectedResults, actualResults);
    }

    @AfterAll
    static final void tearDown() {
        salesLeadsScore = null;
    }
}
