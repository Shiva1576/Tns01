package com.tnsif.java.fundamentals;
import java.util.Scanner;

public class OnlineShoppingDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double price, total = 0, discount, finalAmount;

        // Only Accept prices of 5 products
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter price of product " + i + ": ");
            price = sc.nextDouble();

            total = total + price;
        }

        // Calculating the  discount
        if (total > 5000) {
            discount = total * 0.20;
        } else if (total > 3000) {
            discount = total * 0.10;
        } else {
            discount = 0;
        }

        finalAmount = total - discount;

        // Displaying  bill details
        System.out.println("\n----- Shopping Bill -----");
        System.out.println("Original Total: Rs. " + total);
        System.out.println("Discount Amount: Rs. " + discount);
        System.out.println("Final Payable Amount: Rs. " + finalAmount);

        sc.close();

	}

}
