package com.jacobdgraham.codesignal.InterviewPractice.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Sudoku2Test {
    
    private static Sudoku2 sudoku2;

    @BeforeAll
    final static void setUp() {
        sudoku2 = new Sudoku2();
    }

    @Test
    final void testRegularSudokuIsValid() {
        final char[][] sudokuGrid = {
            {'.', '.', '.', '1', '4', '.', '.', '2', '.'},
            {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
            {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
            {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
            {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
            {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
            {'.', '.', '.', '5', '.', '.', '.', '7', '.'}
        };
        final boolean expectedAnswer = true;
        final boolean actualAnswer = sudoku2.solution(sudokuGrid);
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    final void testRegularSudokuIsInvalid() {
        final char[][] grid = {
            {'.', '.', '.', '.', '2', '.', '.', '9', '.'},
            {'.', '.', '.', '.', '6', '.', '.', '.', '.'},
            {'7', '1', '.', '.', '7', '5', '.', '.', '.'},
            {'.', '7', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '8', '3', '.', '.', '.'},
            {'.', '.', '8', '.', '.', '7', '.', '6', '.'},
            {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
            {'.', '1', '.', '2', '.', '.', '.', '.', '.'},
            {'.', '2', '.', '.', '3', '.', '.', '.', '.'}
        };
        final boolean expectedAnswer = false;
        final boolean actualAnswer = sudoku2.solution(grid);
        assertEquals(expectedAnswer, actualAnswer);
    }

     @Test
    final void testNullSudokuIsInvalid() {
        final char[][] grid = null;
        final boolean expectedAnswer = false;
        final boolean actualAnswer = sudoku2.solution(grid);
        assertEquals(expectedAnswer, actualAnswer);
    }

     @Test
    final void testEmptySudokuIsInvalid() {
        final char[][] grid = {};
        final boolean expectedAnswer = false;
        final boolean actualAnswer = sudoku2.solution(grid);
        assertEquals(expectedAnswer, actualAnswer);
    }
}
