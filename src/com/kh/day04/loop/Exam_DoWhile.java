package com.kh.day04.loop;

import java.util.Scanner;

public class Exam_DoWhile {

	public static void main(String[] args) {
		// �Է��� ���� -1�� �ɴ���� ���ϼ���
		
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		
		do {
			System.out.print("������ �Է��ϼ��� : ");
			i = sc.nextInt();
			if(i==-1) continue;
			sum += i;
		} while(i != -1);

		System.out.println("�Է��� ���� ���� " + sum);
	}

}
