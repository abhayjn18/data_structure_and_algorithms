package com.abhay.problems.array;

import java.util.Arrays;

public class Merge_Two_Array_Without_extra_space {

	public static void main(String[] args) {
		int n = 4, m = 5;
		int arr1[] = { 1, 3, 5, 7 };
		int arr2[] = { 0, 2, 6, 8, 9 };

		merge(arr1, arr2, n, m);
	}

	public static void merge(int arr1[], int arr2[], int n, int m) {

		for (int i = n - 1, j = 0; i >= 0 && j < m; i--, j++) {
			if (arr1[i] > arr2[j]) {
				int tmp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = tmp;
			}
//			System.out.println(Arrays.toString(arr1));
//			System.out.println(Arrays.toString(arr2));
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}
}
