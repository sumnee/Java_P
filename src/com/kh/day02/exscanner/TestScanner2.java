package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String[] args) {
		
		//�Է¹��� �� �ִ� ������: ����, �Ǽ�, ���ڿ�, ����(*)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		int iNum = sc.nextInt();
		
		System.out.print("�Ǽ��� �Է����ּ��� : ");
		double dNum = sc.nextDouble();
		
		System.out.print("���ڿ��� �Է����ּ��� : ");
		String words = sc.next(); // ���ڿ��� �׳� �ؽ�Ʈ
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		char word = sc.next().charAt(0); // ���ڿ����� �޾Ƽ� charAT���� �̾ƾ���
		
		//nextString, nextChar ����!
		
		System.out.println("�Է��� ������ : " + iNum + "�Դϴ�.");
		System.out.println("�Է��� �Ǽ��� : " + dNum + "�Դϴ�.");
		System.out.println("�Է��� ���ڿ��� : " + words + "�Դϴ�.");
		System.out.println("�Է��� ���ڴ� : " + word + "�Դϴ�.");
		
	}

}
