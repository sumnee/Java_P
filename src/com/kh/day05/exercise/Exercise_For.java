package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_For {

	public void exercise1() {

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = i + sum;
		}

		System.out.print("1���� 10������ �� = " + sum);
	}

	public void exercise2() {

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

	public void exercise3() {

		for (int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);

		}
	}

	public void exercise4() {

		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��� ������ �������� ����մϴ� : ");
		int input = sc.nextInt();

		if ((input >= 1) && (input <= 9)) {
			for (int i = 1; i < 10; i++) {
				System.out.println(input + " * " + i + " = " + input * i);
			}
		} else {
			System.out.println("1~9 ������ ������ �Է��ϼ���.");
		}

	}
}
