package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While2 {

	public static void main(String[] args) {
		// ���� �ϳ� �Է� �޾Ƽ� �� ���� 1-9���̸� �� ���� �������� ����ϼ���
		// 1-9 �ƴϸ� �����޼��� ���
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
		System.out.println("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if((num>=1)&&(num<=9)) {
			int i = 1;			
			while(i <= 9) {
				System.out.println(num + " * " + i);
				i++;
			}
		} else {
			System.out.println("1~9 ������ ������ �Է��ϼ���");		
		}
	}
	}

}
