package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Switch {

	public static void main(String[] args) {

		// 1�Է� 2���� 3��ȸ 4���� 0����

		Scanner sc = new Scanner(System.in);

		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("0. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("�Է¸޴��Դϴ�.");
			break;
		case 2:
			System.out.println("�����޴��Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ�޴��Դϴ�.");
			break;
		case 4:
			System.out.println("�����޴��Դϴ�.");
			break;
		case 0:
			System.out.println("����Ǿ����ϴ�.");
			break;
		default:
			System.out.println("0 ~ 4 ������ ���ڸ� �Է��ϼ���.");
		}

	}

}
