package com.kh.day06.exercise;

import java.util.Scanner;

//������ ���α׷��� , �Ѵ��� �ľ� ����~
public class Exercise_ScoreProgram_T {
	
	static int kor = 0; //static ��������=class���� (�Ķ��۾�)
	static int eng = 0;
	static int math = 0; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ESCAPE : 
		while (true) {
			printMenu(); //ctrl������ Ŭ���غ���
			int input = sc.nextInt();			
			switch (input) {
			
			case 1:
				inputScore();
				break;

			case 2:
				printScore();		
				break;			
		
			case 3:
				goodBye();			
				break ESCAPE; 
			
			default :
				printException();	
				break;

			}
		}
	}
	
	public static void printMenu() {
		System.out.println("=====���� �޴�=====");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.println("���� : ");
	}
	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====���� �Է�=====");
		System.out.println("���� : ");
		kor = sc.nextInt();
		System.out.println("���� : ");
		eng = sc.nextInt();
		System.out.println("���� : ");
		math = sc.nextInt();	
	}
	public static void printScore() {
		System.out.println("=====���� ���=====");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println();
		int sum = kor + eng + math;
		System.out.println("���� : " + sum);
		System.out.printf("��� : %.2f \n",(double) sum / 3); 
	}
	public static void goodBye() {
		System.out.println(">>~~Good Bye~~<<");
	}
	public static void printException() {
		System.out.println("1, 2, 3 �߿� �����ϼ���.");
	}
}
