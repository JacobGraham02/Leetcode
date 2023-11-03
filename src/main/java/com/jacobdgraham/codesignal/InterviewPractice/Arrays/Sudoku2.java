package com.jacobdgraham.codesignal.InterviewPractice.Arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with numbers in such a way that each column, each row, and each of the nine 3 × 3 
 * sub-grids that compose the grid all contain all of the numbers from 1 to 9 one time.

Implement an algorithm that will check whether the given grid of numbers represents a valid Sudoku puzzle according to the layout rules described above. 
Note that the puzzle represented by grid does not have to be solvable.
 */
public class Sudoku2 {

    /**
     Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with numbers in such a way that each column, each row, 
     and each of the nine 3 × 3 sub-grids that compose the grid all contain all of the numbers from 1 to 9 one time.

     Implement an algorithm that will check whether the given grid of numbers represents a valid Sudoku puzzle according to the layout rules described above. 
     Note that the puzzle represented by grid does not have to be solvable.
     */
    public boolean solution(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return false;
        }
    for (int i = 0; i < 9; i++) {
        if (!isValidRow(grid, i) || !isValidColumn(grid, i) || !isValidSubgrid(grid, i)) {
            return false;
        }
    }
    return true;
}

    private boolean isValidRow(char[][] board, int row) {
        Set<Character> validRowCharacterHashSet = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            char currentRowChar = board[row][i];
            if (currentRowChar != '.') {
                if (validRowCharacterHashSet.contains(currentRowChar)) {
                    return false;
                }
                validRowCharacterHashSet.add(currentRowChar);
            }
        }
        return true;
        
    }

    private boolean isValidColumn(char[][] board, int column) {
        Set<Character> validColumnCharacterHashSet = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            char currentColumnChar = board[i][column];
            if (currentColumnChar != '.') {
                if (validColumnCharacterHashSet.contains(currentColumnChar)) {
                    return false;
                }
                validColumnCharacterHashSet.add(currentColumnChar);
            }
        }
        return true;
    }

    private boolean isValidSubgrid(char[][] board, int subgrid) {
        Set<Character> validSubgridCharacterHashSet = new HashSet<>();
        /*
        Because we are checking a 3x3 square, we must restrict our for loop to only searching a 3x3 area. Let us suppose subgrid equals 1 (first row and column)
        
        startRow = (1/3)*3 = 0
        startColumn = (1%3)*3 = 3
        
        Therefore, we must search the first row, and search the column at location 0
        We will search the 0th, 1st, and 2nd locations in the 0th column.  
        */
        int startRow = (subgrid / 3) * 3;
        int startColumn = (subgrid % 3) * 3;
        // Check each row from the first row to the third row
        for (int i = startRow; i < startRow + 3; i++) {
            // Check each column from the first column to the third column
            for (int j = startColumn; j < startColumn + 3; j++) {
                char currentSubgridCharacter = board[i][j];
                if (currentSubgridCharacter != '.') {
                    if (validSubgridCharacterHashSet.contains(currentSubgridCharacter)) {
                        return false;
                    }
                }
                validSubgridCharacterHashSet.add(currentSubgridCharacter);
            }
        }
        return true;
    }
}
