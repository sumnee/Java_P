package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// �Է��� ������ 1~100���̿� ���°�?
		System.out.print("������ �Է����ּ��� : ");
		int num = sc.nextInt();
		boolean result1 = (1 < num) && (num < 100);
		System.out.println(result1);
		
		 // �Է¹��� ���ĺ��� �빮���ΰ�? (�ƽ�Ű�ڵ� �� ���ڷ� �빮�� �Ǻ�) 
		System.out.print("���ĺ��� �Է����ּ��� : ");
		char word = sc.next().charAt(0);
		boolean result2 = (65 <= word) && (word <= 90);
		// boolean result2 = ('A' <= word) && (word <= 'Z'); �̰͵� ����
		System.out.println(result2);
		
	}

}
