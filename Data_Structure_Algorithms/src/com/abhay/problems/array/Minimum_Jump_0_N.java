package com.abhay.problems.array;

public class Minimum_Jump_0_N {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 1, 0, 9 };

		System.out.println("Minimum number of jumps to reach end is : " + minJumps(arr, arr.length));
	}

	private static Integer minJumps(int[] arr, int n) {
		int jump_arr[] = new int[n];

		if (n == 0 || arr[0] == 0)
			return Integer.MAX_VALUE;
		jump_arr[0] = 0;

		for (int i = 1; i < n; i++) {
			jump_arr[i] = Integer.MAX_VALUE;
			for (int j = 0; j < i; j++) {

				if (i <= j + arr[j] && jump_arr[j] != Integer.MAX_VALUE) {
					jump_arr[i] = Math.min(jump_arr[i], jump_arr[j] + 1);
					break;
				}
			}
		}
		return jump_arr[n - 1];
	}
}
