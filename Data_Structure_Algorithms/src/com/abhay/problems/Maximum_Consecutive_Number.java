package com.abhay.problems;

import java.util.HashSet;

public class Maximum_Consecutive_Number {
	public static void main(String[] args) {
		int ar[] = { 3, 7, 2, 0, 9, 12, 1 };
		System.out.println(findMximum(ar));
	}

	private static int findMximum(int[] ar) {
		HashSet<Integer> hashSet = new HashSet<>();

		for (int i = 0; i < ar.length; i++) {
			hashSet.add(ar[i]);
		}
		System.out.println(hashSet);
		int ans = 0;
		for (int i = 0; i < ar.length; i++) {
			if (hashSet.contains(ar[i])) {
				int j = ar[i];

				while (hashSet.contains(j)) {
					j++;
					System.out.print(j + "->");
				}
				System.out.println();
				ans = Math.max(ans, j - ar[i]);
			}
		}

		return ans;
	}
}
