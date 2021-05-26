package com.abhay.problems;

public class String_Permutation {
	public static void main(String[] args) {
		permuate("abc", 0, 3);
	}

	private static void permuate(String input, int l, int r) {
		if (l == r) {
			System.out.println();
			System.out.println(input);
			return;
		}

		for (int i = l; i < input.length(); i++) {
			input = swap(input, l, i);
			permuate(input, l + 1, r);
			System.out.print(input + "->");
			input = swap(input, l, i);
		}
	}

	private static String swap(String input, int l, int i) {
		char tmp = input.charAt(l);
		char[] arr = input.toCharArray();
		arr[l] = arr[i];
		arr[i] = tmp;
		return String.valueOf(arr);
	}

}
