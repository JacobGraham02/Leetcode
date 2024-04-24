package com.jacobdgraham.hackerrank.warmup;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountingValleysTest {
    
    private final CountingValleys countingValleys = new CountingValleys();

    @Test
    public void testCountingValleysNoValleys() {
        String path = "UUDD";
        int steps = path.length();
        int expected = 0;
        assertEquals(expected, countingValleys.countingValleys(steps, path), "There should be no valleys");
    }

    @Test
    public void testCountingValleysOneValley() {
        String path = "UDDU";
        int steps = path.length();
        int expected = 1;
        assertEquals(expected, countingValleys.countingValleys(steps, path), "There should be one valley");
    }

    @Test
    public void testCountingValleysMultipleValleys() {
        String path = "DDUUDDUDUU";
        int steps = path.length();
        int expected = 2;
        assertEquals(expected, countingValleys.countingValleys(steps, path), "There should be two valleys");
    }

    @Test
    public void testCountingValleysComplexPath() {
        String path = "UDUDUDUD";
        int steps = path.length();
        int expected = 0;
        assertEquals(expected, countingValleys.countingValleys(steps, path), "There should be no valleys");
    }
}
