package com.sunrizeit;

import java.util.Scanner;

// Program to find the sum of the first n natural numbers
public class NaturalNumbersSum {

	public static void main(String[] args) {
		double time=System.currentTimeMillis();
		NaturalNumbersSum natur=new NaturalNumbersSum(); 
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("** Program to find the sum of natural numbers up to the given input **");
			natur.findSum(sc);
			System.out.println("Time taken - "+(System.currentTimeMillis()-time) +"millesec");
			
		}
	}

	private static void findSum(Scanner sc) {
		System.out.print("Enter N value to find natural numbers: ");
		int n = sc.nextInt(); // Read the value of n

		// Correct formula for the sum of the first n natural numbers
		int sum = n * (n + 1) / 2;
		System.out.println("Sum of natural numbers up to the given number is " + sum);

		// Ask the user if they want to try again
		System.out.println("Do you want to try one more? If yes, enter Y else N");
		String confirm = sc.next();

		// Handle user response
		if (confirm.equalsIgnoreCase("Y")) {
			findSum(sc); // Call findSum again for a new input
		} else if (confirm.equalsIgnoreCase("N")) {
			System.out.println("Thank you for using the program! TOtal time taken");
		} else {
			System.out.println("Please select Y or N");
			findSum(sc); // Prompt again for valid input
		}
	}
}
