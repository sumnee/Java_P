package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For4 {

	public static void main(String[] args) {
		// ���� �ϳ� �Է� �޾Ƽ� �� ���� 1-9���̸� �� ���� �������� ����ϼ���
		// 1-9 �ƴϸ� �����޼��� ���

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

