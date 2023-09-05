package com.jacobdgraham.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public final class ValidParenthesisTest {
    
    private static ValidParenthesis validParenthesis;

    @BeforeAll
    static final void setUp() {
        validParenthesis = new ValidParenthesis();
    }

    @Test
    final void testStringWithInvalidParenthesis() {
        final String invalid_parenthesis = "(]";
        final boolean expected_output = false;
        final boolean actual_output = validParenthesis.isValid(invalid_parenthesis);
        assertEquals(expected_output, actual_output);
    }

    @Test
    final void testStringWithValidParenthesis() {
        final String valid_parenthesis = "()";
        final boolean expected_output = true;
        final boolean actual_output = validParenthesis.isValid(valid_parenthesis);
        assertEquals(expected_output, actual_output);
    }

    @AfterAll
    static final void tearDown() {
        validParenthesis = null;
    }
}
