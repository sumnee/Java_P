package com.kh.practice.condition;

import java.util.Scanner;

public class If_Practice2 {

	public static void main(String[] args) {
		// ¦Ȧ�Ǻ�1
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		
		int num = sc.nextInt();
		String result = " ";
	
		if(num %2 ==0) {
			result = "¦���Դϴ�.";
		}
		else if (num %2 ==1) {
			result = "Ȧ���Դϴ�.";
		}
		System.out.println("�Է��� ������ " + result);
	}

}
