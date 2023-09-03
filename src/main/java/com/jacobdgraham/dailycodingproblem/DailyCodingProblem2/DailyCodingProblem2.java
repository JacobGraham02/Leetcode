package com.jacobdgraham.dailycodingproblem.DailyCodingProblem2;

import java.util.NoSuchElementException;

/**
 * Implement a 2D iterator class. It will be initialized with an array of arrays, and should implement the following methods:
 *  next() - returns the next element in the array of arrays. If there are no more elements, raise an exception
 *  has_next() - returns whether or not the iterator still has elements left
 *  
 * For example, giveh the input [[1,2], [3], [], [4,5,6]] calling next() repeatedly should output 1,2,3,4,5,6
 * Do not use flatten or otherwise clone the arrays. Some of the arrays can be empty
 */
public final class DailyCodingProblem2<T> implements IDailyCodingProblem2Iterator<T> {

    private T[][] array_of_values;
    private int row = 0;
    private int column = 0;

    public DailyCodingProblem2(final T[][] array_for_iteration) {
        this.array_of_values = array_for_iteration;
    }

    /**
     * @return T
     */
    @Override
    public T next() {
        if (!has_next()) {
            throw new NoSuchElementException("There are no more elements within the array");
        }
        T element = array_of_values[row][column++];
        if (column >= array_of_values[row].length) {
            column = 0;
            row++;
        }
        return element;
    }

    /** 
     * @return boolean
     */
    @Override
    public boolean has_next() {
        while (row < array_of_values.length && (column >= array_of_values[row].length || array_of_values[row].length == 0)) {
            row++;
            column = 0;
        }
        return row < array_of_values.length;
    }
}
