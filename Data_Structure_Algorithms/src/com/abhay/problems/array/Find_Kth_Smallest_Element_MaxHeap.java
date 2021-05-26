package com.abhay.problems.array;

import java.util.PriorityQueue;

public class Find_Kth_Smallest_Element_MaxHeap {
	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<>((a, b) -> b - a);
		int[] arr = { 3, 3, 3, 3, 3, 3, 6, 6, 6, 6, 6, 7, 8, 9000, 12, 0, 10000 };

		for (int i = 0; i < arr.length; i++) {
			if (!pQueue.contains(arr[i]))
				pQueue.add(arr[i]);
			if (pQueue.size() > 3) {
				System.out.println(pQueue);
				pQueue.remove();
			}
		}
		System.out.println(pQueue.size());
		System.out.println(pQueue.remove());
	}
}
