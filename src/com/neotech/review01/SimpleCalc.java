package com.neotech.review01;

import java.util.Scanner;

public class SimpleCalc {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		double d1 = scan.nextDouble();

		System.out.println("Please enter the second number:");
		double d2 = scan.nextDouble();

		// System.out.println(d1 + " " + d2);

		System.out.println("Please enter the operator (+,-,*,/)");
		String operator = scan.next();

		double result = 0;

		if (operator.equals("+")) {
			result = d1 + d2;
		} else if (operator.equals("-")) {
			result = d1 - d2;
		} else if (operator.equals("*")) {
			result = d1 * d2;
		} else if (operator.equals("/")) {
			result = d1 / d2;
		} else {
			System.out.println("Invalid operator");
		}

		if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
			System.out.println("The result is -> " + result);
		}

		scan.close();

	}
}
