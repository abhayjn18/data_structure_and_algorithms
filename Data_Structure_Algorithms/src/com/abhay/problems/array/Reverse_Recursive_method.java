package com.abhay.problems.array;

import java.util.Arrays;

public class Reverse_Recursive_method {
	public static void main(String[] args) {
		int[] arr = {1, 3, 6, 7, 8, 9 };
		int n = arr.length - 1;
		int r = 0;
		System.out.println(Arrays.toString(reverse(arr, r, n)));
	}

	private static int[] reverse(int[] arr, int r, int l) {

		if (r > l) {
			return arr;
		}
		int tmp = arr[l];
		arr[l] = arr[r];
		arr[r] = tmp;
		reverse(arr, ++r, --l);

		return arr;
	}
}
