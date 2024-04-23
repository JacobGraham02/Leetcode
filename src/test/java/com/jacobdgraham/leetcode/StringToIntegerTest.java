package com.jacobdgraham.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.StringToInteger;

public class StringToIntegerTest {

    private static StringToInteger stringToInteger;

    @BeforeAll
    static void setUp() {
        stringToInteger = new StringToInteger();
    }

    @Test
    public void testBasicConversions() {
        assertEquals(123, stringToInteger.stringToInteger("123"), "Failed to convert '123'");
        assertEquals(-123, stringToInteger.stringToInteger("-123"), "Failed to convert '-123'");
        assertEquals(0, stringToInteger.stringToInteger("0"), "Failed to convert '0'");
    }

    @Test
    public void testWithLeadingWhitespaces() {
        assertEquals(123, stringToInteger.stringToInteger("   123"), "Failed to convert '   123'");
        assertEquals(-123, stringToInteger.stringToInteger("   -123"), "Failed to convert '   -123'");
    }

    @Test
    public void testWithInvalidCharacters() {
        assertEquals(123, stringToInteger.stringToInteger("123abc"), "Failed to convert '123abc'");
        assertEquals(-123, stringToInteger.stringToInteger("-123abc"), "Failed to convert '-123abc'");
    }

    @Test
    public void testWithOverflow() {
        assertEquals(Integer.MAX_VALUE, stringToInteger.stringToInteger("9999999999"), "Failed to handle overflow with '9999999999'");
        assertEquals(Integer.MIN_VALUE, stringToInteger.stringToInteger("-9999999999"), "Failed to handle underflow with '-9999999999'");
    }

    @Test
    public void testWithSigns() {
        assertEquals(123, stringToInteger.stringToInteger("+123"), "Failed to convert '+123'");
        assertEquals(-123, stringToInteger.stringToInteger("-123"), "Failed to convert '-123'");
    }

    @Test
    public void testEmptyAndNullStrings() {
        assertEquals(0, stringToInteger.stringToInteger(""), "Failed to convert empty string");
        assertEquals(0, stringToInteger.stringToInteger(null), "Failed to convert null string");
    }

    @Test
    public void testWithNonNumericStrings() {
        assertEquals(0, stringToInteger.stringToInteger("abc"), "Failed to convert 'abc'");
        assertEquals(0, stringToInteger.stringToInteger("+-12"), "Failed to convert '+-12'");
    }

    @AfterAll
    static void tearDown() {
        stringToInteger = null;
    }
}
