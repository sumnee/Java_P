package com.kh.day05.array;

public class Exam_Sortinsertion {

	public static void main(String[] args) {

		// 삽입정렬
		
		int arr[] = { 2, 5, 4, 1, 3 };
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;

				}
			}

		}
		for (int i = 0; i < arr.length; i++) { //배열 출력
			System.out.print(arr[i] + " ");
		}

	}

}
