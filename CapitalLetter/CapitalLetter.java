package CapitalLetter;

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {

		char x;
		
		while(true) {
			System.out.println("Enter a letter (a-zA-Z): ");
			Scanner input = new Scanner(System.in);
			x = input.nextLine().trim().charAt(0);
			
			if(!Character.isLetter(x)) {
				System.out.println("Error in input: " + x);
			} else if (Character.isUpperCase(x)) {
				System.out.println("Uppercase: " + x);
				
			} else if (Character.isLowerCase(x)) {
				System.out.println("Lowercase: " + x);
			}
		}
	}

}
