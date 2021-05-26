package com.abhay.problems.array;

public class Maximum_Sub_Array_contiguous {
	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int n = arr.length - 1;

		System.out.println(maxSubarraySum(arr, n));
	}

	private static int maxSubarraySum(int[] arr, int n) {
		int sum = arr[0];
		int curr = arr[0];
		int start = -1;
		int end = - 1;
		for (int i = 1; i <= n; i++) {
			
			if(arr[i]> curr + arr[i]) {
				start = i;
			}
			curr = Math.max(arr[i], curr + arr[i]);
			if(sum < curr) {
				end = i;
			}
			sum = Math.max(sum, curr);
			
		}
		System.out.println("start : "+start+" end: "+ end);
		return sum;
	}
}
