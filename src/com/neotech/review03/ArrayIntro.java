package com.neotech.review03;

public class ArrayIntro {

	public static void main(String[] args) {

		int a = 4;
		int b = 2;
		int c = 3;
		int d = 5;

		int sum = a + b + c + d;

		System.out.println("The sum is -> " + sum);

		//1st way to declare an array
		int[] arr = new int[4];
		arr[2] = 3;
		arr[1] = 2;
		arr[0] = 4;
		arr[3] = 5;

		int sumArr = 0;

		for (int i = 0; i < arr.length; i++) {
			sumArr += arr[i];
		}

		System.out.println("The sum of the array is -> " + sumArr);

		//2nd way to declare an array
		int[] arr2 = { 4, 2, 3, 5 };

		int sumArr2 = 0;

		for (int num : arr2) {
			sumArr2 += num;
		}

		System.out.println("The sum of the array2 is -> " + sumArr2);

	}

}
