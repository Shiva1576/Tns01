package com.tnsif.java.fundamentals;
/* Armstrong Definition:An Armstrong number is a number that is equal to the sum of its own digits each raised
 *  to the power of the number of digits. (e.g., 153 = 1^3 + 5^3 + 3^3).*/

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number = 153, originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
	}

}
