package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While3 {

	public static void main(String[] args) {
		// while ���� �̿��Ͽ� -1�� �Էµɴ� ���� ������ �Է¹ް� -1�� �Ǹ� �Է��� ���� ���� ����Ͻÿ�

		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;

		while (num != -1) {
			System.out.print("������ �Է��Ͻð�, �������� -1�� �Է��ϼ��� : ");
			num = sc.nextInt();
			if (num != -1) {
				sum += num;
			}

		}

		System.out.println("�Է��Ͻ� ���� ���� " + sum);

	}
}
