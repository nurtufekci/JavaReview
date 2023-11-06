package com.neotech.review01;

import java.util.Scanner;

// Import shortcut : cmd + shift + O

public class LogicalAND {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your age: ");
		int age = scan.nextInt();

		String res = "";

		if (age >= 1 && age <= 3) {
			res = " baby!";
		} else if (age > 3 && age <= 5) {
			res = " toddler!";
		} else if (age > 5 && age <= 12) {
			res = " kid!";
		} else if (age > 12 && age < 20) {
			res = " teenager!";
		} else if (age >= 20 && age < 120) {
			res = " adult!";
		} else {
			res = " alien!";
		}

		System.out.println("You are a/an" + res + " aged " + age);
		scan.close();

	}
}
