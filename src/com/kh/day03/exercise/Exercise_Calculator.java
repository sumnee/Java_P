package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {

	public static void main(String[] args) {
		// �ܼ� ���� �ۼ�

		Scanner sc = new Scanner(System.in);

		System.out.print("����1���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();

		System.out.print("����2���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();

		System.out.print("�����ڸ� �Է��ϼ��� : ");
		char oper = sc.next().charAt(0);

		int result = 0;

		if (oper == '+') {
			result = num1 + num2;
		} else if (oper == '-') {
			result = num1 - num2;
		} else if (oper == '*') {
			result = num1 * num2;
		} else if (oper == '/') {
			result = num1 / num2;
		} else if (oper == '%') {
			result = num1 % num2;
		}

		System.out.println(num1 + " " + oper + " " + num2 + " " + "=" + " " + result);
	}

}
