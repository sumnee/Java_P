package com.kh.day04.exercise;

public class Exercise_For2 {

	public static void main(String[] args) {
		// 1���� 10������ ������ ǥ���ϰ� �յ� ���Ͻÿ� (ȥ�� �ٽ� �غ���)

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = i + sum;
			System.out.print(i);
			if (i <= 9) {
				System.out.print("+");
			} else {
				System.out.print(" = ");
			}
		}
		System.out.println(sum);
	}

}
