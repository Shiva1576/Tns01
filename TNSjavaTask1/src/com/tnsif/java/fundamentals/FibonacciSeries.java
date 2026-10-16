package com.tnsif.java.fundamentals;
/*Fibonacci Series Definition:The Fibonacci series is a sequence of numbers where each number
 *  is the sum of the two preceding ones, usually starting with 0 and 1.*/

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

	}

}
