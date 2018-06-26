package com.cse.Ex4;
import java.util.Scanner;
public class AreaAndPerimeterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter length:");
		double length = input.nextDouble();
		
		System.out.println("Enter width:");
		double width = input.nextDouble();
		
		System.out.println("Area: " + (length * width));
		System.out.println("Perimeter: " + (length * 2 + width * 2));
		
		input.close();
	}

}
