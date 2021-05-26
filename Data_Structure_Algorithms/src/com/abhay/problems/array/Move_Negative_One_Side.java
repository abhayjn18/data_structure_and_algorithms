package com.abhay.problems.array;

import java.util.Arrays;

public class Move_Negative_One_Side {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, -2, -3, 4, -6, 10, 12, -5 };
		int n = arr.length - 1;
		System.out.println(Arrays.toString(move_negative(arr, n)));
	}

	private static int[] move_negative(int[] arr, int n) {
		int i = -1;
		int pivot = arr[n];
		for (int j = 0; j <= n; j++) {
			if (arr[j] >= 0) {
				i++;
				int tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
			}

		}
		System.out.println(i);
		/*
		 * i++; int tmp = arr[n]; arr[n] = arr[i]; arr[i] = tmp;
		 */
		return arr;
	}
}
