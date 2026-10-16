package com.tnsif.java.fundamentals;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 20, b = 10;
        
        // condition ? expressionIfTrue : expressionIfFalse
        int min = (a < b) ? a : b;
        System.out.println("The minimum value is: " + min);
        
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(a + " is " + result);

	}

}
