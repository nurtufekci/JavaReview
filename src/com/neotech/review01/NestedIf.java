package com.neotech.review01;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your gender: (M/F)");
		char gender = scan.next().charAt(0);

		System.out.println("Are you married? (true/false)");
		boolean married = scan.nextBoolean();

		if (gender == 'M' || gender == 'm') {
			System.out.println("Yaay, it's a boy");

			if (married) {
				System.out.println("Buy flowers for your wife!");
			} else {
				System.out.println("Buy a ring for your gf!");
			}

		} else if (gender == 'F' || gender == 'f') {
			System.out.println("Yaay, it's a girl");

			if (married) {
				System.out.println("Buy lego sets for your husband!");
			} else {
				System.out.println("Buy lego sets for your bf!");
			}

		} else {
			System.out.println("Invalid gender!");

		}

//		System.out.println("Please enter your gender: (M/F)");
//		char gender = scan.next().charAt(0);
//
//		System.out.println("Are you married? (true/false)");
//		boolean married = scan.nextBoolean();
//
//		if (gender == 'M' && married) { // married male
//			System.out.println("Buy Flowers!");
//		} else if (gender == 'M' && !married) { // Not married male
//			System.out.println("Buy a ring!");
//		} else if (gender == 'F' && married) { // married female
//			System.out.println("Buy lego sets!");
//		} else if (gender == 'F' && !married) { // Not married female
//			System.out.println("Buy a lego set!");
//		} else {
//			System.out.println("Invalid gender!");
//		}

		scan.close();

	}

}
