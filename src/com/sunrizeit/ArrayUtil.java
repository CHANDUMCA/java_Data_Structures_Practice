package com.sunrizeit;

public class ArrayUtil {

	public void printarray(int[] arr) {
/*
  		for(int value:arr) {
			System.out.println(value);
		}
*/		

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

	public void demo() {
		int[] myarray = new int[5];// default values will be zero because we decalared it is na int so it will be 0
		myarray[0] = 5;
		myarray[1] = 1;
		myarray[2] = 8;
		myarray[3] = 8;
		printarray(myarray);
	}

	public static void main(String[] args) {
		ArrayUtil arr = new ArrayUtil();
		arr.demo();
	}

}
