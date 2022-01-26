package com.infy.logicprograms.arrays;

public class StringPrograms {

	public static void main(String[] args) {

		String str = "fund";

//		countNoOfChar(str);
//		countVowelsAndConsonants(str);
//		divideStringNequalParts(str);
		printAllSubstrings(str);

	}

	private static void printAllSubstrings(String str) {

		int n = str.length();

//		int totalNoOfSubstrings = n * (n + 1) / 2;

		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {

				System.out.print(str.substring(i, j + 1) + " ");
			}
		}

	}

	private static void divideStringNequalParts(String str) {

		int len = str.length();
		int i = 0;
		int k = 0;

		if (len % 2 == 0) {
			i = 2;

		} else if (len % 3 == 0)
			i = 3;
		else
			i = 0;

		int l = 0;
		if (i == 3) {
			for (int j = 0; j < str.length(); j += 3) {
				k = j;
				l += i;
				System.out.println(str.substring(k, l));

			}
		} else if (i == 2) {
			for (int j = 0; j < str.length(); j += 2) {
				k = j;
				l += i;
				System.out.println(str.substring(k, l));

			}

		} else
			System.out.println("Cannot be equally divided because the lenth is " + len);
	}

	private static void countVowelsAndConsonants(String str) {

		int countOfVowels = 0;
		int countOfConsonants = 0;
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')
				countOfVowels++;
			else
				countOfConsonants++;

		}
		System.out.println(countOfVowels + " " + countOfConsonants);
	}

	private static void countNoOfChar(String str) {

		char[] arr = str.toCharArray();

		System.out.println(arr.length);
	}

}
