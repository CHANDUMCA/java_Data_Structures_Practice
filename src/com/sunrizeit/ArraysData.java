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
		System.out.println("After using sor method");
		Arrays.sort(array);
		for (int value : array) {
			System.out.println(value);

		}

	}
}
