package com.kh.day05.array;

public class Exam_SortBubble {

	public static void main(String[] args) {

		// 버블정렬

		int arr[] = { 2, 5, 4, 1, 3 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < (arr.length - 1) - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
