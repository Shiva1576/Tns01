package com.tnsif.java.fundamentals;

public class BitwiseOperators {

	public static void main(String[] args) {
		int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        System.out.println("a & b (Bitwise AND): " + (a & b));   // 0001
        System.out.println("a | b (Bitwise OR): " + (a | b));    // 0111
        System.out.println("a ^ b (Bitwise XOR): " + (a ^ b));   // 0110
        System.out.println("~a (Bitwise Complement): " + (~a));  
        System.out.println("a << 1 (Left Shift): " + (a << 1));  // 1010 
        System.out.println("a >> 1 (Right Shift): " + (a >> 1)); // 0010 

	}

}
