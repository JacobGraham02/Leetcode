package com.jacobdgraham.codesignal.InterviewPractice.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FirstNotRepeatingCharacterTest {
    
    private static FirstNotRepeatingCharacter firstNotRepeatingCharacter;

    @BeforeAll
    final static void setUp() {
        firstNotRepeatingCharacter = new FirstNotRepeatingCharacter();
    }

    @Test
    final void testNormalString() {
        final String normal = "abacabad";
        final char expectedResult = 'c';
        final char actualResult = firstNotRepeatingCharacter.solution(normal);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    final void testStringWithLengthZero() {
        final String nolength = "";
        final char expectedResult = '_';
        final char actualResult = firstNotRepeatingCharacter.solution(nolength);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    final void testStringEqualsNull() {
        final String nullstring = null;
        final char expectedResult = '_';
        final char actualResult = firstNotRepeatingCharacter.solution(nullstring);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    final void testStringEqualsStringabacabaabacaba() {
        final String testString = "abacabaabacaba";
        final char expectedResult = '_';
        final char actualResult = firstNotRepeatingCharacter.solution(testString);
        assertEquals(expectedResult, actualResult);
    }

    @AfterAll
    final static void tearDown() {
        firstNotRepeatingCharacter = null;
    }
} 
