package com.jacobdgraham.leetcode.Easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class TestPalindromeNumber {

    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void testNumberIsPalindromeNumber() {
        int numberForPalindrome = 121;
        assertTrue(palindromeNumber.isPalindromeNoConversion(numberForPalindrome));
    }

    @Test
    void testNumberIsPalindromeNumberConversionToString() {
        int numberForPalindrome = 121;
        assertTrue(palindromeNumber.isPalindromeStringConversion(numberForPalindrome));
    }

    @Test
    void testNumberIsNotPalindromeNumber() {
        int numberForPalindrome = -121;
        assertFalse(palindromeNumber.isPalindromeNoConversion(numberForPalindrome));
    }

    @Test
    void testNumberIsNotPalindromeNumberConversionToString() {
        int numberForPalindrome = 5948345;
        assertFalse(palindromeNumber.isPalindromeStringConversion(numberForPalindrome));
    }
    

}
