package com.neotech.review03;

import java.util.Scanner;

public class ScannerArray {
	// Ask the user: How many numbers do you want to store in the array?
	// Ask him to enter the numbers: Read numbers and enter them into the array
	// Print the numbers from the array

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How many numbers do you want to store in the array?");
		int size = input.nextInt();

		// Declaring the array
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter a number:");
			array[i] = input.nextInt();
		}

		System.out.println("Let's print the numbers from the array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println();

		int total = 0;
		System.out.println("Let's print the numbers using enhanced for loop");
		for (int num : array) {
			System.out.print(num + " ");
			total += num;
		}
		System.out.println("\nTotal of array numbers : " + total);

		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += array[i];
		}
		System.out.println("\nSum of array numbers : " + sum);
		
		input.close();

	}

}
