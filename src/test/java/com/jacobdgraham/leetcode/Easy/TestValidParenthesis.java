package com.jacobdgraham.leetcode.Easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestValidParenthesis {
    
    private final ValidParenthesis validParenthesis = new ValidParenthesis();

    @Test
    public void testValidParenthesisReturnsTrue() {
        String evaluateToTrue = "([{}])";
        assertTrue(validParenthesis.isValid(evaluateToTrue));
    }

    @Test
    public void testValidParenthesisReturnsFalse() {
        String evaluateToFalse = "([)";
        assertFalse(validParenthesis.isValid(evaluateToFalse));
    }
}
