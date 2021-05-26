package com.abhay.problems.array;

public class Find_Kth_Smallest_Element_Quick_Select {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 7, 8, 9000, 12, 0, 10000 };
		int n = arr.length - 1;
		int k = 3;
		System.out.println(find_kth_Smallest(arr, 0, n, k));
	}

	private static int find_kth_Smallest(int[] arr, int l, int r, int k) {
		int pivot = partition(arr, l, r);
		if (pivot + 1 == k) {
			return arr[pivot];
		} else if (pivot + 1 > k) {
			return find_kth_Smallest(arr, l, pivot - 1, k);
		}
		return find_kth_Smallest(arr, pivot + 1, r, k);
	}

	private static int partition(int[] arr, int l, int r) {
		int pivot = arr[r];
		int i = l;
		for (int j = l; j <= r - 1; j++) {

			if (pivot >= arr[j]) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
			}
		}
//		i++;
		int tmp = arr[i];
		arr[i] = arr[r];
		arr[r] = tmp;
		return i;
	}
}
