package com.abhay.problems.array;

import java.util.Arrays;

public class Find_Min_Max {
	public static void main(String[] args) {
		int[] arr = { 3, 6, 7, 8, 9000, 12, 0,10000 };
		int l = arr.length - 1;
		int r = 0;
		int[] min_max = { Integer.MAX_VALUE, Integer.MIN_VALUE };
		System.out.println(Arrays.toString(find(arr, r, l, min_max)));
	}

	private static int[] find(int[] arr, int r, int l, int[] min_max) {

		if (r > l)
			return min_max;
		if (arr[r] > arr[l]) {
			min_max[1] = Math.max(arr[r], min_max[1]);
			min_max[0] = Math.min(arr[l], min_max[0]);
		} else {
			min_max[1] = Math.max(arr[l], min_max[1]);
			min_max[0] = Math.min(arr[r], min_max[0]);
		}

		find(arr, ++r, --l, min_max);
		return min_max;
	}
}
