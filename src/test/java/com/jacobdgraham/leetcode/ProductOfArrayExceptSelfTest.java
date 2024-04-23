package com.jacobdgraham.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.ProductOfArrayExceptSelf;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterAll;

public class ProductOfArrayExceptSelfTest {

    private ProductOfArrayExceptSelf productOfArrayExceptSelf;

    @BeforeEach
    public void setUp() {
        productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
    }

    @Test
    public void testExample1() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelfEasierToUnderstand(nums));
    }

    @Test
    public void testExample2() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelfEasierToUnderstand(nums));
    }

    @Test
    public void testAllOnes() {
        int[] nums = {1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelfEasierToUnderstand(nums));
    }

    @Test
    public void testZerosAndOnes() {
        int[] nums = {0, 1, 0, 3, 0};
        int[] expected = {0, 0, 0, 0, 0};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelfEasierToUnderstand(nums));
    }

    @Test
    public void testSingleZero() {
        int[] nums = {1, 2, 3, 0, 4, 5};
        int[] expected = {0, 0, 0, 120, 0, 0};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelfEasierToUnderstand(nums));
    }
}
