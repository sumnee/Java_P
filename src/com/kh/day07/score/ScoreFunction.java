package com.kh.day07.score;

import java.util.Scanner;

public class ScoreFunction {
	private int kor; //�������
	private int eng;
	private int math;
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====���� �޴�=====");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.println("���� : ");
		int input = sc.nextInt();
		return input; //run�޴��� ������
	}
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====���� �Է�=====");
		System.out.println("���� : ");
		kor = sc.nextInt();
		System.out.println("���� : ");
		eng = sc.nextInt();
		System.out.println("���� : ");
		math = sc.nextInt();	
	}
	public void printScore() {
		System.out.println("=====���� ���=====");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println();
		int sum = kor + eng + math;
		System.out.println("���� : " + sum);
		System.out.printf("��� : %.2f \n",(double) sum / 3); 
	}
	public void goodBye() {
		System.out.println("Good Bye~");
	}
	
	public void printException() {
		System.out.println("1, 2, 3 �߿� �����ϼ���.");
	}

}
