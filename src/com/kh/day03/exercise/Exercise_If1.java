package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {

	public static void main(String[] args) {
		// �Է¹��� ������ ��, 0, �� �������� �Ǻ�

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();

		String result = ""; // ""�ʱ�ȭ ���ִ� ����

		if (num == 0) {
			result = "0";
		} else if (num > 0) {
			result = "���� ����";
		} else {
			result = "���� ����";
		}

		System.out.println("�Է��� ������ " + result + "�Դϴ�.");
	}

}
