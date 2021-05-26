package com.abhay.problems.array;

import java.util.Arrays;

public class Reverse_Array {
	public static void main(String[] args) {
		int[] arr = { 3, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(reverse(arr)));
	}

	private static int[] reverse(int[] arr) {
		for (int i = 0, j = arr.length - 1; i < arr.length && j >= arr.length / 2; i++, j--) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		return arr;
	}
}
