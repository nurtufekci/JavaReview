package com.neotech.review04;

public class TwoD_Array {

	public static void main(String[] args) {

		// 1D Array
		// int[] num = { 4, 5, 6};

		// 2D Array
		int[][] nums = { { 2, 8, 4 }, { 6, 0, 7 }, { 9, 5, -3 }, { 8, 1, 4 } };

		System.out.println(nums[1][2]);
		System.out.println(nums[3][1]);

		System.out.println(nums[0][1]); // 8
		System.out.println(nums[3][0]); // 8

		System.out.println("--------------------------------");

		// Nested enhanced for loop
		for (int[] row : nums) {

			// I will iterate the row (1D-Array) with an enhanced for loop
			for (int element : row) {
				System.out.print(element + " ");
			}

			System.out.println();

		}

		// to get the row with index 2
		// int[] row2 = nums[2];

		System.out.println("--------------------------------");

		for (int[] row : nums) {

			// iterating the row (1D-Array) with a normal for loop
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i] + " ");
			}

			System.out.println();

		}

	}

}
