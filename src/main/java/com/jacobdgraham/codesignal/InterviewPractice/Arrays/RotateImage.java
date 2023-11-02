package com.jacobdgraham.codesignal.InterviewPractice.Arrays;

public final class RotateImage {
    
    public final int[][] rotateImageSolution(int[][] a) {
        if (a == null || a.length == 0) {
            return a;
        }
        
        int arrayLength = a.length;
        int originalElement = 0;
        
        
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i; j < arrayLength; j++) {
                originalElement = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = originalElement;
            }
        }
        
        
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength / 2; j++) {
                originalElement = a[i][j];
                a[i][j] = a[i][arrayLength-j-1];
                a[i][arrayLength-j-1] = originalElement;              
            }
        }
        
        return a;
    }
}
