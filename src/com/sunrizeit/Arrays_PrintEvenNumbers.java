package com.sunrizeit;

import java.util.Arrays;

public class Arrays_PrintEvenNumbers {

	public void even(int[] input) {
		System.out.print("with for each : ");
		for (int out : input) {
			if (out % 2 == 0) {
				System.out.print(" " + out);
			}
		}

	}

//with streams api
	public void evenstr(int[] input) {

		Arrays.stream(input) // Convert array to stream
				.filter(n -> n % 2 == 0) // Keep only even numbers
				.forEach(System.out::println); // Print each
	}

	public void arraydata() {
		int[] input = { 1, 3, 23, 24, 6, 29, 39 };
		even(input);
		System.out.println(" with streams : ");
		evenstr(input);
	}

	public static void main(String[] args) {
		Arrays_PrintEvenNumbers print = new Arrays_PrintEvenNumbers();
		print.arraydata();

	}

}
