package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {

	public static void main(String[] args) {
		// 입력받은 정수가 양, 0, 음 정수인지 판별

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();

		String result = ""; // ""초기화 해주는 과정

		if (num == 0) {
			result = "0";
		} else if (num > 0) {
			result = "양의 정수";
		} else {
			result = "음의 정수";
		}

		System.out.println("입력한 정수는 " + result + "입니다.");
	}

}
