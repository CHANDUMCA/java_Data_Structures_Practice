package com.sunrizeit;

import java.util.Iterator;

/*
 * To Reverse a String
 * 1. Get the input array
 * 2. Find its length and assign to one variable
 * 3. declare a variable and check that variable=length-1
 * 4. Declared variable must be greater than or equal to Zero.
 * 5. print the input array index with declared variable 
 * 6. and decrease the declareed variable by eac time -1
 */

/*
It depends on your goal:

✅ Case 1: If you only want to display in reverse
You can’t reuse the reversed array later — it’s only printed.
✅ Case 2: If you want to actually reverse the array data
Use in-place reversal (swap with two pointers).
The array itself is reversed, you can reuse it later.

*/
public class ReverseArray {
	public static void main(String[] args) {
		int[] input = { 1, 10, 20, 2, 5, 13 };
		// To print actual values
		System.out.println("original input is ");
		int len = input.length;
		for (int i = 0; i < len; i++) {
			System.out.print(" " + input[i]);
		}

		System.out.println("\n\n\n Case 1 Reverse output");
/*
		for (int rev = len - 1; rev >= -1; rev--) {
			try {
				System.out.print(" " + input[rev]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("\n Skipped invalid index: " + rev);
			}
		}
*/
		// Case 1
		for (int j = len - 1; j >= 0; j--) {
			System.out.print(" " + input[j]);
		}
			System.out.println("\n\n Case 2 Reversed array throug whileloop:");
			
			int start = 0, end = len - 1;
			while (start < end) {
			    int temp = input[start];
			    input[start] = input[end];
			    input[end] = temp;
			    start++;
			    end--;
			}
			
			
			for(int out:input) {
				System.out.print(" "+out);
			}
		
		
	}
}
