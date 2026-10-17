package com.tnsif.java.fundamentals;
import java.util.Scanner;
public class ATMWithdrawalSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient account balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: Rs. " + balance);
        }

        sc.close();
		

	}

}
