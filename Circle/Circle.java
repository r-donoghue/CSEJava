package Circle;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		double x = 0;
		final double pi = 3.14;
		
		while(true) {
			System.out.println("Enter a radius: ");
			Scanner input = new Scanner(System.in);
			x = input.nextInt();
			
			double d = 2*x;
			double c = 2*(pi)*(x) ;
			double a = (pi)*Math.pow(x,2);
			
			System.out.println("Diameter: " + d);
			System.out.println("Circumference: " + c);
			System.out.println("Area: " + a);
			
		}

	}

}
