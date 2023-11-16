package com.neotech.review03;

public class MagicDollar {

	// $$$$$
	// $$$$$
	// $$$$$
	// $$$$$

	public static void main(String[] args) {

		// Hard way
		// System.out.println("$$$$$");
		// System.out.println("$$$$$");
		// System.out.println("$$$$$");
		// System.out.println("$$$$$");

//		for (int i = 101; i <= 104; i++) {
//			
//			for (int j = 11; j <= 15; j++) {
//				System.out.print("$");
//			}
//			
//			System.out.println();
//			
//		}

//		 Task 
//		 $$$$$
//		 $   $
//		 $   $
//		 $$$$$

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5; j++) {

				if (i == 1 || i == 4 || j == 1 || j == 5) {
					System.out.print("$");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();

		}

	}

}
