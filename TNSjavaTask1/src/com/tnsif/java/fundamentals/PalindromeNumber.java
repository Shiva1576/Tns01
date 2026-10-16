package com.tnsif.java.fundamentals;
/*Palindrome Definition:A palindrome is a word, number, phrase, or other sequence of characters 
 * which reads the same backward as forward (e.g., "madam" or 121).*/

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 12321; // The number to be checked
        int originalNumber = number;
        int reversedNumber = 0;
        int remainder;

        // Loop to reverse the number
        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        // Check if the original number is equal to its reverse
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a Palindrome Number.");
        } else {
            System.out.println(originalNumber + " is not a Palindrome Number.");
        }	

	}

}
