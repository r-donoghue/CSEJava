package com.cse.AsciiValues;

import java.util.Scanner;

public class AsciiValues {

	public static void main(String[] args) {
		
		System.out.println("Enter a char:");
		Scanner input = new Scanner(System.in);
		char choice = input.next().trim().charAt(0);

		while (choice != 'x') {
			System.out.println("Ascii value of " + choice + " is " + (int) choice);
			System.out.println("Enter a char:");
			choice = input.next().charAt(0);
		}
		
		input.close();

	}

}
