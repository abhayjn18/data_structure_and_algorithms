package com.abhay.problems.array;

import java.util.Arrays;

public class Minimize_height {
	public static void main(String[] args) {
		int k = 4;
		int n = 10;
		int[] arr = { 6, 1, 9, 1, 1, 7, 9, 5, 2, 10 };
		System.out.println(getMinDiff(arr, n, k));
	}

	static int getMinDiff(int[] arr, int n, int k) {

		Arrays.sort(arr);

		int minEle, maxEle;
		int result = arr[n - 1] - arr[0];

		for (int i = 1; i <= n - 1; i++) {
			if (arr[i] >= k) {
				maxEle = Math.max(arr[i - 1] + k, arr[n - 1] - k);
				minEle = Math.min(arr[0] + k, arr[i] - k);

				result = Math.min(result, maxEle - minEle);
			}
		}
		return result;

	}
}
