package com.cse.Ex5;

import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			System.out.println("Enter grade:");
			int mark = input.nextInt();

			if (mark >= 85 && mark <= 100) {
				System.out.println("A");
			} else if (mark >= 70 && mark < 85) {
				System.out.println("B");
			} else if (mark >= 55 && mark < 70) {
				System.out.println("C");
			} else if (mark >= 40 && mark < 55) {
				System.out.println("D");
			} else if (mark < 40 && mark > 0) {
				System.out.println("Fail");
			} else {
				System.out.println("Invalid Input: " + mark);
			}

			System.out.println("Continue? (y/n):");
			choice = input.next();
		}

		System.out.println("Exiting.");

		input.close();
	}

}
