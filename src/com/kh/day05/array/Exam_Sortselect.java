package com.kh.day05.array;

public class Exam_Sortselect {

	public static void main(String[] args) {

		// ��������

		int arr[] = { 2, 5, 4, 1, 3 };
		int min; // �ε��� �� ����
		for (int i = 0; i < arr.length; i++) {
			min = i; // ���� ���� �� �ε�����
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
