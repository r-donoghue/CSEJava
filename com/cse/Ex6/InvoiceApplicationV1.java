package com.cse.Ex6;

import java.util.Scanner;

public class InvoiceApplicationV1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double discountPercent = 0.0;
		String choice = "y";
		int count = 0;
		int discountCount = 0;
		double averageValue = 0;
		double averageDiscount = 0;

		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println();

		while (choice.equalsIgnoreCase("y")) {

			++count;
			++discountCount;

			System.out.println("Now working on Invoice #" + count);
			System.out.println();

			System.out.println("Enter subtotal:");
			double subtotal = input.nextDouble();

			if (subtotal >= 500) {
				discountPercent = 0.25;
			} else if (subtotal >= 200 && subtotal < 500) {
				discountPercent = 0.2;
			} else if (subtotal >= 100 && subtotal < 200) {
				discountPercent = 0.1;
			} else {
				discountPercent = 0.0;
				--discountCount;
			}

			double discountAmount = subtotal * discountPercent;
			double total = subtotal - discountAmount;

			System.out.println("Subtotal:			" + subtotal);
			System.out.println("Discount percent:		" + discountPercent);
			System.out.println("Discount amount: 		" + discountAmount);
			System.out.println("Total:				" + total);

			averageValue += total;
			averageDiscount += discountAmount;

			System.out.println("Continue? (y/n):");
			choice = input.next();
		}

		System.out.println("Number of Invoices:		" + count);
		System.out.println("Average invoice:	" + averageValue / count);
		System.out.println("Average discount:	" + averageDiscount / discountCount);

		input.close();
	}

}
