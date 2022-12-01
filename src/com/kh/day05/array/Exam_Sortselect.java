package com.kh.day05.array;

public class Exam_Sortselect {

	public static void main(String[] args) {

		// 선택정렬

		int arr[] = { 2, 5, 4, 1, 3 };
		int min; // 인덱스 값 저장
		for (int i = 0; i < arr.length; i++) {
			min = i; // 가장 작을 때 인덱스값
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;

				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
