package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է����ּ���.");
		String name = sc.next();
		
		System.out.println("�¾ ���� �Է����ּ���.");
		int month = sc.nextInt();
		
		System.out.println("Ű�� �Է����ּ���");
		double tall = sc.nextDouble();
		
		System.out.println("������ �Է����ּ���.");
		char boy = sc.next().charAt(0);
		
		System.out.println("�ּҸ� �Է����ּ���.");
		sc.nextLine(); // �������ſ�, �ؽ�Ʈ������ ������ ���͸� �Ծ �ٷ� �Ѿ�� ����
		String address = sc.nextLine();
		
		System.out.println("�̸��� " + name + "�Դϴ�.");
		System.out.println("�¾ ���� " + month + "�Դϴ�.");
		System.out.println("Ű�� " + tall + "�Դϴ�.");
		System.out.println("������ " + boy + "�Դϴ�.");
		System.out.println("�ּҴ� " + address + "�Դϴ�.");
		
		
	}

}
