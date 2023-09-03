package com.jacobdgraham.dailycodingproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.jacobdgraham.dailycodingproblem.DailyCodingProblem2.DailyCodingProblem2;

public class dailycodingproblem2test {
    private static DailyCodingProblem2 dailyCodingProblem2;
    private static final Object[][] input = new Object[][] {
            {1,2},
            {3},
            {},
            {4,5,6}
        };

    @BeforeAll
    static final void setUp() {
        dailyCodingProblem2 = new DailyCodingProblem2(input);
    }

    @Test
    final <T> void testMethodWithInputOfIntegerArray() {
        int[] expected_output_array = new int[]{1,2,3,4,5,6};
        List<T> actual_output_arraylist = new ArrayList<>();
        while (dailyCodingProblem2.has_next()) {
            actual_output_arraylist.add((T) dailyCodingProblem2.next());
        }
        int[] actual_output_array = new int[actual_output_arraylist.size()];
        for (int i = 0; i < actual_output_arraylist.size(); i++) {
            actual_output_array[i] = (int) actual_output_arraylist.get(i);
        }
        assertArrayEquals(expected_output_array, actual_output_array);
    }
    
    @Test
    final void testMethodWithEmptyArray() {
        DailyCodingProblem2<Integer> dailyCodingProblem2EmptyIterator = new DailyCodingProblem2<>(new Integer[][]{});
        assertFalse(dailyCodingProblem2EmptyIterator.has_next());
        assertThrows(NoSuchElementException.class, dailyCodingProblem2EmptyIterator::next);
    }

    @AfterAll
    static final void tearDown() {
        dailyCodingProblem2 = null;
    }
}
