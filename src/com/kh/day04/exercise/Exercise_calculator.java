package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_calculator {

	public static void main(String[] args) {
		// ����ġ�� ���� �ۼ�

		Scanner sc = new Scanner(System.in);
		System.out.print("����1���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("����2���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է��ϼ��� : ");
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
