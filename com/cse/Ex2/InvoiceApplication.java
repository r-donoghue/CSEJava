package com.cse.Ex2;

public class InvoiceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double subtotal = 100;
		double discountPercent = 0.2;
		double discountAmount = subtotal * discountPercent;
		double total = subtotal - discountAmount;
		
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println();
		
		System.out.println("Subtotal:			" + subtotal );
		System.out.println("Discount percent:	" + discountPercent);
		System.out.println("Discount amount: 	" + discountAmount);
		System.out.println("Total:				" + total);
	}

}
