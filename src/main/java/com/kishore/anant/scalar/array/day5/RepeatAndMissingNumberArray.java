package com.kishore.anant.scalar.array.day5;

import java.util.Arrays;

public class RepeatAndMissingNumberArray {

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 5, 3};

        int[] result = repeatedNumber(arr);

        System.out.println(Arrays.toString(result));
    }

    public static int[] repeatedNumber(final int[] A) {
        /*
        Solution Approach
            Sum(Actual) = Sum(1...N) + A - B

            Sum(Actual) - Sum(1...N) = A - B.

            Sum(Actual Squares) = Sum(1^2 ... N^2) + A^2 - B^2

            Sum(Actual Squares) - Sum(1^2 ... N^2) = (A - B)(A + B)

            = (Sum(Actual) - Sum(1...N)) ( A + B).
         */
        int x=0, y=0;
        int actualSum = 0;
        long sumSquares = 0;
        int n = A.length;
        for(int i:A){
            actualSum += i;
            sumSquares += Math.pow(i,2);
        }
        long totalSum = ((long) n *(n+1))/2;
        long totalSqauresSum =

        return [x,y];
    }
}

/*

Q2. Repeat and Missing Number Array
Solved
feature icon
Using hints is now penalty free
Use Hint
There are certain problems which are asked in the interview to also check how you take care of overflows in your problem.
This is one of those problems.
Please take extra care to make sure that you are type-casting your ints to long properly and at all places. Try to verify if your solution works if number of elements is as large as 105

Food for thought :

Even though it might not be required in this problem, in some cases, you might be required to order the operations cleverly so that the numbers do not overflow.
For example, if you need to calculate n! / k! where n! is factorial(n), one approach is to calculate factorial(n), factorial(k) and then divide them.
Another approach is to only multiple numbers from k + 1 ... n to calculate the result.
Obviously approach 1 is more susceptible to overflows.
You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3]

Output:[3, 4]

A = 3, B = 4
Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
Arg 1: An Integer Array, For e.g [1,2,3]
 */
