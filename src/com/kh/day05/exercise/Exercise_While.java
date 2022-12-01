package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {

	public void exercise1() {

		int num = 1;
		int sum = 0;

		while (num < 100) {
			sum = sum + num;
			num += 2; // num = num + 2
		}
		System.out.println(sum);

	}

	public void exercise2() {

		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("정수를 입력하세요 : ");
			int num = sc.nextInt();

			if ((num >= 1) && (num <= 9)) {
				int i = 1;
				while (i <= 9) {
					System.out.println(num + " * " + i);
					i++;
				}
			} else {
				System.out.println("1~9 사이의 정수를 입력하세요");
			}

		}
	}

	public void exercise3() {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;

		while (num != -1) {
			System.out.print("정수를 입력하시고, 마지막에 -1을 입력하세요 : ");
			num = sc.nextInt();
			if (num != -1) {
				sum += num;
			}

		}

		System.out.println("입력하신 수의 합은 " + sum);

	}

	public void exercise4() {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int sum = 0;

		while (num != -1) {
			System.out.print("정수를 입력하시고, 마지막에 -1을 입력하세요 : ");
			num = sc.nextInt();
			if (num != -1) {
				sum += num;
			}

		}

		System.out.println("입력하신 수의 합은 " + sum);

	}
}
