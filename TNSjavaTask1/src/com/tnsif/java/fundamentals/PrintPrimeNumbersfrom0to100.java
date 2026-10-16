package com.tnsif.java.fundamentals;

public class PrintPrimeNumbersfrom0to100 {

	public static void main(String[] args) {
    System.out.println("Prime numbers from 0 to 100:");
        
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

	}

}
