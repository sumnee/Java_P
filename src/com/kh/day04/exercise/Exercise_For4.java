package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For4 {

	public static void main(String[] args) {
		// 정수 하나 입력 받아서 그 수가 1-9사이면 그 수의 구구단을 출력하세요
		// 1-9 아니면 오류메세지 출력

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

