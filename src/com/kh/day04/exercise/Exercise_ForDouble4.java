package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ForDouble4 {

	public static void main(String[] args) {
		//��� ���� �����1
		// �Էµ� ������ŭ Ʈ����� �� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	

	}

}
