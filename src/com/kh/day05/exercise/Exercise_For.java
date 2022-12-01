package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_For {

	public void exercise1() {

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = i + sum;
		}

		System.out.print("1부터 10까지의 합 = " + sum);
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
		System.out.print("입력한 정수의 구구단을 출력합니다 : ");
		int input = sc.nextInt();

		if ((input >= 1) && (input <= 9)) {
			for (int i = 1; i < 10; i++) {
				System.out.println(input + " * " + i + " = " + input * i);
			}
		} else {
			System.out.println("1~9 사이의 정수를 입력하세요.");
		}

	}
}
