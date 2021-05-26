package com.abhay.problems.array;

import java.util.Arrays;

public class Rotate_By_one_Clockwise {

	public static void main(String[] args) {
		long n = 8;
		long[] arr = { 9, 8, 7, 6, 4, 2, 1, 3 };
		rotate(arr, n);
	}

	public static void rotate(long arr[], long n) {

		long tmp = arr[(int) n - 1];

		for (long i = n - 1; i > 0; i--) {

			arr[(int) i] = arr[(int) (i - 1)];
		}
		arr[0] = tmp;
		System.out.println(Arrays.toString(arr));
	}
}
