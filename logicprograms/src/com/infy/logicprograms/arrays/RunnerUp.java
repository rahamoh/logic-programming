package com.infy.logicprograms.arrays;

public class RunnerUp {

	public static void main(String[] args) {

		int[] arr = { 6, 8, 10, 12, 14, 16, 18, 20 };
		int len = arr.length;

		int runnerUp = findRunnerUp(arr, len);

		System.out.println(runnerUp);

	}

	private static int findRunnerUp(int[] arr, int len) {

		int res = 0;
		int j = 0;
		while (len > 1) {
			for (int i = 1; i < len; i += 2) {

				if (len != 2) {
					arr[j] = arr[i];
					res = arr[i];
					j++;
				} else if(arr.length==3)
					res = arr[len - len];

			}

			len = len / 2;

			res = res + findRunnerUp(arr, len);
		}

		return res;
	}

}
