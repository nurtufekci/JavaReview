package com.neotech.review02;

public class WhileDemo {

	public static void main(String[] args) {
		String greeting = "Miremengjes";

//		System.out.println(greeting);
//		System.out.println(greeting);
//		System.out.println(greeting);
//		System.out.println(greeting);
//		System.out.println(greeting);

		int num = 0;

		while (num < 5) {
			num++;
			System.out.println(num + " - " + greeting);
		}

//		int a = 50;
//		int b = ++a;
//		System.out.println(b);

		System.out.println("--------------------------------");

		int count = 5;
		while (count > 1) {
			System.out.println("Happy Father's Day!");
			count--;
		}

		System.out.println("--------------------------------");

		int i = 0;
		while (true) {
			if (i == 3) {
				break;
			}
			System.out.println(greeting);
			i++;
		}

	}

}
