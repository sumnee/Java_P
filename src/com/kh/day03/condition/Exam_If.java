package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_If {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = ""; //���� ������� �ʰ� ������ ������ ����� �ڵ� ¥��!
		
		if(num %2 == 0) {
			result = "¦��";
		}
		else {
			result = "Ȧ��";
		}
		
		System.out.println(num + "��/�� " + result +"�Դϴ�.");
		
	}
}
