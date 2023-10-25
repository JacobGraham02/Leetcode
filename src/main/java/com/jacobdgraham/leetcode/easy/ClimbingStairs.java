package com.jacobdgraham.leetcode.easy;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
    Input: n = 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps
Example 2:
    Input: n = 3
    Output: 3
    Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step

Constraints:
    1 <= n <= 45
 */
public final class ClimbingStairs {

    public final int climbStairs(final int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        /*
        Create new array for use in storing results of calculations to avoid re-calculations later
        */
        int[] arrayPreviousCalculations = new int[n+1];

        /*
        Base cases:
        The 0th step can be reached by doing nothing, and the 1st step can be reached by taking one step
        In both cases, the number of steps is 1 because something is being done. 
        */
        arrayPreviousCalculations[0] = 1;
        arrayPreviousCalculations[1] = 1;

        /*
        Iterative approach:
        We begin iterating over all of the stairs starting at stair 2, and iterating until stair N, proceeding one stair at a time. Because each time we can climb 1 or 2 steps, we can fetch the results of previous calculations from n-1 and n-2 to calculate the number of ways to climb the stairs. Below is an example of when n = 2 how the solution is calculated

        n = 2
        arrayPreviousCalculations[n] = arrayPreviousCalculations[1] + arrayPreviousCalculations[0];
        When there are 2 steps, the number of distinct ways to reach the top is 2. 

        n = 3
        arrayPreviousCalculations[n] = arrayPreviousCalculations[2] + arrayPreviousCalculations[1];

        n = 4
        arrayPreviousCalculations[n] = arrayPreviousCalculations[3] + arrayPreviousCalculations[2];
        ...
        and so on
        */
        for (int i = 2; i <= n; i++) {
            arrayPreviousCalculations[i] = arrayPreviousCalculations[i-1] + arrayPreviousCalculations[i-2];
        }
        return arrayPreviousCalculations[n];
    }
}
/*
 * class Solution {
 public static int climbStairs(int n) {
  if(n<=0){
   return 0;
  }
  else if (n == 1) {
   return 1;
  }
  else{
   int[] steps = new int[n + 1];
   steps[0] = 1;
   steps[1] = 1;
   for (int i = 2; i <= n; i++) {
   steps[i] = steps[i - 2] + steps[i - 1];
   }
  }
 return steps[n];
 }
 public static void main(String[] args) {
  int n=3;
  System.out.println(climbStairs(n));
 }
 */
