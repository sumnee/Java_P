package com.kh.practice.condition;

import java.util.Scanner;

public class If_Practice1 {

	public static void main(String[] args) {
		//�����Ǻ�1
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		
		int num = sc.nextInt();
		String result = " ";
		
		if(num>0) {
			result = "����Դϴ�.";
		}
		else if(num<0) {
			result = "�����Դϴ�.";
		}
		else {
			result = "0�Դϴ�";
		}
		
		System.out.println(result);
	}

}
