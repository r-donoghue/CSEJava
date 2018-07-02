package AssignmentTests;

import java.util.Scanner;

public class AssignmentTests {

	public static void main(String[] args) {
		int x = 0;

		System.out.println("Enter a number (1..10):");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();

		if (x >= 1 && x <= 5) {
			System.out.println("The square of " + x + " is: " + Math.pow(x, 2));
		} else if (x >= 6 && x <= 10) {
			System.out.println("The cube of " + x + " is: " + Math.pow(x, 3));
		} else {
			System.out.println("INVALID - input outside range of (0..10):" + x);
		}

		input.close();
	}

}
