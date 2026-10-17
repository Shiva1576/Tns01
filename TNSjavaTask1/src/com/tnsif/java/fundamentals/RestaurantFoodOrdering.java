package com.tnsif.java.fundamentals;
import java.util.Scanner;
public class RestaurantFoodOrdering {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int choice, quantity;
	        double price, total;

	        while (true) {
	            System.out.println("\n===== RESTAURANT MENU =====");
	            System.out.println("1. Pizza        - Rs. 200");
	            System.out.println("2. Burger       - Rs. 100");
	            System.out.println("3. Sandwich     - Rs. 80");
	            System.out.println("4. French Fries - Rs. 60");
	            System.out.println("5. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            if (choice == 5) {
	                System.out.println("Thank you! Visit again.");
	                break;
	            }

	            switch (choice) {
	                case 1:
	                    price = 200;
	                    System.out.println("Selected Item: Pizza");
	                    break;

	                case 2:
	                    price = 100;
	                    System.out.println("Selected Item: Burger");
	                    break;

	                case 3:
	                    price = 80;
	                    System.out.println("Selected Item: Sandwich");
	                    break;

	                case 4:
	                    price = 60;
	                    System.out.println("Selected Item: French Fries");
	                    break;

	                default:
	                    System.out.println("Invalid menu choice!");
	                    continue;
	            }

	            System.out.print("Enter quantity: ");
	            quantity = sc.nextInt();

	            if (quantity <= 0) {
	                System.out.println("Invalid quantity! Enter a positive number.");
	            } else {
	                total = price * quantity;
	                System.out.println("Total Bill: Rs. " + total);
	            }
	        }

	        sc.close();

	}

}
