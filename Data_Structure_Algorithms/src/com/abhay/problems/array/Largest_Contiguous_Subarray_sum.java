package com.abhay.problems.array;

public class Largest_Contiguous_Subarray_sum {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, -2, -3, 4, -6, 10, 12, -5 };
		int n = arr.length - 1;

		System.out.println(maxSubarraySum(arr, n));
	}

	// arr: input array
	// n: size of array
	// Function to find the sum of contiguous subarray with maximum sum.
	static int maxSubarraySum(int arr[], int n) {

		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int a : arr) {

			sum += a;
			if (sum < 0)
				sum = 0;
			max = Math.max(sum, max);
		}
		return max;
	}
}
