package com.kh.day06.exception;

import java.util.Scanner;

public class Exam_Exception {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			int num1 = sc.nextInt();
			System.out.print("���� �Է� : ");
			int num2 = sc.nextInt();
			System.out.println("������ ����");
			int result = num1 / num2;
			System.out.println("���� " + result + "�Դϴ�~");

		} catch (ArithmeticException e) {
			System.out.println("0���� ������ �ȵ˴ϴ�!");
		}

	}

}
