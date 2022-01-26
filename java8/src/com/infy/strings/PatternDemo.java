package com.infy.strings;

public class PatternDemo {
	public static void main(String[] args) {
		int k = 5;
		int l = 0;

		for (int i = 0; i < 5; i++) {

			for (int j = l * (k - i); j >= 0; j--)
				System.out.print(" ");

			for (int j = 0; j <= i; j++)
				System.out.print("* ");
			System.out.println();

		}
	}

}
