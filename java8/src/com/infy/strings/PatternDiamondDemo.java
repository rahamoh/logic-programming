package com.infy.strings;

public class PatternDiamondDemo {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}
		
		System.out.print(" ");

		for (int i = 1; i <= 5; i++) {
			System.out.print(" ");


			for (int l = 1; l <= i; l++) {
				System.out.print(" ");
			}

			for (int k = 4; k >= i; k--) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
