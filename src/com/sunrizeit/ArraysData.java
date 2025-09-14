package com.sunrizeit;

import java.util.*;

public class ArraysData {

	public static void main(String[] args) {
		// 1. Declare & Initialize
		int[] array = { 1, 3, 4, 6, 8, 2, 7, 9 };

		/*
		 * we can use the for loop to fetch the data from the above array for (int i =
		 * 0; i < array.length; i++) { System.out.println(array[i]); }
		 */
		// by using for each loop
		for (int value : array) {
			System.out.println(value);
		}

		// 2 to sort the array
		System.out.println("After using sort method");
		Arrays.sort(array);
		for (int value : array) {
			System.out.println(value);

		}
// TO find the missing number
		int min = array[0];
		int max = array[0];
		System.out.println("Aftermi or max");
		for (int value : array) {

			if (value < min) min = value;
			if(value>max) max=value;
			
		}
		System.out.println(" min "+min);
		System.out.println(" max "+max);

	}
}
