package com.neotech.review01;

public class Variable {

	public static void main(String[] args) {

		// Format Code shortcut : cmd + shift + F
		// PrintLine shortcut : sysout + ctrl + space
		// Main Method shortcut : main + ctrl + space

		// Declaring a variable
		String name;

		// Assigning a value/ Initializing
		name = "Nur";

		// Concatenate
		System.out.println("My name is " + name);

		// Declaring & Initializing
		String lName = "Tufekci";

		System.out.println(name + " " + lName);

		int age = 23;
		System.out.println("I am " + age + " years old!");
		System.out.println("Next year I will be " + (age + 1) + " years old!");
		System.out.println("If I had not concatenate properly my age could be " + age + 1);

		// until re-assigning value does not change!
		System.out.println(age);

		// re - assign
		// shorthand/compound operator 
		age += 10;
		System.out.println("10 years later I will be " + age);
		System.out.println(name + " " + lName + " " + age);

	}
}
