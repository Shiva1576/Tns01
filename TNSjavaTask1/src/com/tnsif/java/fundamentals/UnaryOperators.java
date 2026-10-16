package com.tnsif.java.fundamentals;

public class UnaryOperators {

	public static void main(String[] args) {
		int a = 10;
        boolean bl = true;

        System.out.println("Unary plus (+a): " + (+a));
        System.out.println("Unary minus (-a): " + (-a));
        
        System.out.println("Pre-increment (++a): " + (++a)); // Increments, then uses
        System.out.println("Post-increment (a++): " + (a++)); // Uses, then increments
        System.out.println("Value after post-increment: " + a);
        
        System.out.println("Pre-decrement (--a): " + (--a));
        System.out.println("Post-decrement (a--): " + (a--));
        System.out.println("Value after post-decrement: " + a);
        
        System.out.println("Logical complement (!bl): " + (!bl));

	}

}
