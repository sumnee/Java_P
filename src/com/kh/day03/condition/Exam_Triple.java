package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Triple {

	public static void main(String[] args) {
		
		/* ���׿����� : �׸��� 3��
		 * �������� ��ȯ�ϸ� ��,�� �����ڸ� �ַ� �����
		 * (���ǽ�) ? ���϶� : �����϶�    <--����       */
		 
		
		//������ �Է¹޾� ¦������ Ȧ������ �Ǻ��ϴ� ���α׷� �ۼ��ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = (num %2 == 0) ? "¦��" : "Ȧ��";
		
		System.out.println(num + " ��/�� " + result + "�Դϴ�.");
		
	}

}
