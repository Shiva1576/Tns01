package com.tnsif.java.fundamentals;
/*Factorial Definition: The factorial of a non-negative integer n, denoted by n!, is the
 *  product of all positive integers less than or equal to n.*/

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
        long factorial = 1;
        for(int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);

	}

}
