package com.infy.logicprograms.arrays;

import java.util.Arrays;

public class ArrayPrograms {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0 };

//		calculateSum(arr);
//		duplicateElements(arr);
//		reverseElementPrint(arr);
//		printElementInEvenPosition(arr);
//		printLargestElementOfArray(arr);
//		sumOfArray(arr);
//		rightRotateArray(arr);
//		sortBinaryArray(arr);

	}

	private static void sortBinaryArray(int[] arr) {
//
//		int countOfZeros = 0;
//		int j = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 0) {
//				countOfZeros += 1;
//			}
//		}
//		int countOfOnes = arr.length - countOfZeros;
//
//		while (countOfZeros > 0) {
//			arr[j] = 0;
//			countOfZeros--;
//			j++;
//		}
//
//		if (countOfZeros == 0) {
//			while (countOfOnes > 0) {
//				arr[j] = 1;
//				countOfOnes--;
//				j++;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void rightRotateArray(int[] arr) {
		int j = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = j;
		System.out.println(Arrays.toString(arr));

	}

	private static void sumOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

	private static void printLargestElementOfArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println(arr[arr.length - 1]);
	}

	private static void printElementInEvenPosition(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0)
				System.out.println(arr[i]);
		}
	}

	private static void reverseElementPrint(int[] arr) {

		int[] brr = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			brr[j] = arr[i];
			j++;
		}
		System.out.println(Arrays.toString(brr));
	}

	private static void duplicateElements(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j])
					System.out.print(arr[i] + " ");

			}

		}

	}

	private static void calculateSum(int[] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println(sum);

	}

}
