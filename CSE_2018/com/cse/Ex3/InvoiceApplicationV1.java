package com.cse.Ex3;

import java.util.Scanner;

public class InvoiceApplicationV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter subtotal:");
		double subtotal = input.nextDouble();
		
		//double subtotal = 100;
		
		System.out.println("Enter discountPercent:");
		double discountPercent = input.nextDouble();
		
		//double discountPercent = 0.2;
		
		double discountAmount = subtotal * discountPercent;
		double total = subtotal - discountAmount;
		
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println();
		
		System.out.println("Subtotal:			" + subtotal );
		System.out.println("Discount percent:	" + discountPercent);
		System.out.println("Discount amount: 	" + discountAmount);
		System.out.println("Total:				" + total);
		
		input.close();
	}

}
