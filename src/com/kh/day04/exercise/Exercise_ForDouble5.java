package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ForDouble5 {

	public static void main(String[] args) {
		// ��� �����2 �Ф� Ʋ�� �ٽ�Ȯ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();

		int i;
		int j;
		
		for(i=num; i>0;i--) {
			for(j=num; j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
