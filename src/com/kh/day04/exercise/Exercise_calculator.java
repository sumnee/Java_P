package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_calculator {

	public static void main(String[] args) {
		// 스위치문 계산기 작성

		Scanner sc = new Scanner(System.in);
		System.out.print("정수1번을 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2번을 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력하세요 : ");
		char oper = sc.next().charAt(0);

		int result = 0;

		switch (oper) {
		case '+':
			result = num1 + num2;
			break;

		case '-':
			result = num1 - num2;
			break;

		case '*':
			result = num1 * num2;
			break;

		case '/':
			result = num1 / num2;
			break;

		case '%':
			result = num1 % num2;
			break;
		}

		System.out.println(num1 + " " + oper + " " + num2 + " " + "=" + " " + result);
		

	}

}
