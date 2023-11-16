package com.neotech.review03;

public class StringArray {

	public static void main(String[] args) {

		String[] animals = { "dog", "cat", "elephant", "mouse", "horse" };

		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();

		for (String element : animals) {
			System.out.print(element + " ");
		}
		System.out.println();

		System.out.println("--------------------------------");
		System.out.println("Let's print the animals in reverse order");

		for (int i = animals.length - 1; i >= 0; i--) {
			System.out.print(animals[i] + " ");
		}
		
		//printing backwards with enhanced for loop is not possible

	}

}
