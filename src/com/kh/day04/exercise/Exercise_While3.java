package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While3 {

	public static void main(String[] args) {
		// while 문을 이용하여 -1이 입력될대 까지 정수를 입력받고 -1이 되면 입력한 수의 합을 출력하시오

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
