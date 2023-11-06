package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {

		// byte < short < int < long < float < double

		// widening/implicit/automatic casting
		int n = 1903;
		double dN = n;
		// double dN = (double) n ;
		System.out.println("int -> " + n + " double -> " + dN + " (widening)");

		int nums = (int) dN;
		System.out.println("double -> " + dN + " int -> " + nums + " (narrowing)");

		short s = (short) n;
		System.out.println("int -> " + n + " byte -> " + s + " (narrowing)");

		// narrowing/explicit/manual casting
		int num = 127;
		byte b = (byte) num;
		// after 127 byte variable will lose data
		System.out.println("int -> " + num + " byte -> " + b + " (narrowing)");

	}

}
