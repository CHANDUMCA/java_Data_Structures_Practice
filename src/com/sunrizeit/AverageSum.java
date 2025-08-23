package com.sunrizeit;

import java.util.Scanner;

// Average of given numbers

public class AverageSum {

	public static void main(String[] args) {
		findAvg();

	}

	private static void findAvg() {
		Scanner sc = new Scanner(System.in);
		int a,b,c,sum;
		System.out.print("Ente a Value: ");
		a=sc.nextInt();
		System.out.print("Ente b Value: ");
		b=sc.nextInt();
		System.out.print("Ente b Value: ");
		c=sc.nextInt();
		sum=a+b+c;
		int avg=sum/3;
		System.out.println("Average of given numbers is : "+avg);
		System.out.println("Do you want to try one mor time : Y/N" );
		String input=sc.next();
		if(input.equalsIgnoreCase("Y")) {
			findAvg();
		}
		else {
			System.out.println("Thank you using average ");
		}
		

	}

}
