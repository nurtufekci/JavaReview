package com.neotech.review02;

import java.util.Scanner;

public class CalculatorSwitch {
	// Ask the user to enter 2 numbers
	// Ask the user for the operator (+,-,*,/)
	// Solve it using switch-case

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

		switch (operator) {
		case "+":
			result = d1 + d2;
			break;
		case "-":
			result = d1 - d2;
			break;
		case "*":
			result = d1 * d2;
			break;
		case "/":
			result = d1 / d2;
			break;
		default:
			System.out.println("Invalid operator");
			break;
		}

		if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))
			System.out.println("The result is " + result);

//		char var1 = 't';		
//		if (var1 == 't') {
//			
//		}
//			
//		String var2 = "t";
//		if (var2.equalsIgnoreCase("T")) {
//			
//		}
		
		scan.close();

	}

}
