package com.jacobdgraham.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class InsertIntervalTest {
    
    private static InsertInterval insertInterval;
    
    @BeforeAll
    static void setUp() {
        insertInterval = new InsertInterval();
    }

    @Test
    public void testInsertingIntoEmptyArray() {
        int[][] intervals = {};
        int[] newInterval = {5, 7};
        int[][] expected = {{5, 7}};
        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }

    @Test
    public void testInsertingWithoutOverlap() {
        int[][] intervals = {{1, 2}, {8, 10}};
        int[] newInterval = {3, 7};
        int[][] expected = {{1, 2}, {3, 7}, {8, 10}};
        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }

    @Test
    public void testInsertingWithOverlap() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] expected = {{1, 5}, {6, 9}};
        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }

    @Test
    public void testInsertingWithCompleteOverlap() {
        int[][] intervals = {{1, 8}};
        int[] newInterval = {2, 5};
        int[][] expected = {{1, 8}};
        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }

    @Test
    public void testInsertingAtStart() {
        int[][] intervals = {{6, 9}};
        int[] newInterval = {1, 5};
        int[][] expected = {{1, 5}, {6, 9}};
        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }

    @Test
    public void testInsertingWithMultipleOverlaps() {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        int[][] expected = {{1, 2}, {3, 10}, {12, 16}};
        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }

    @Test
    public void testInsertingNewIntervalSpanningAllIntervals() {
        int[][] intervals = {{1, 5}, {6, 10}};
        int[] newInterval = {2, 8};
        int[][] expected = {{1, 10}};
        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }

    @Test
    public void testInsertingBetweenIntervals() {
        int[][] intervals = {{1, 2}, {8, 10}};
        int[] newInterval = {3, 7};
        int[][] expected = {{1, 2}, {3, 7}, {8, 10}};
        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }

    @AfterAll
    static void tearDown() {
        insertInterval = null;
    }
}
