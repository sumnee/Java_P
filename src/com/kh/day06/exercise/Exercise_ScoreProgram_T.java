package com.kh.day06.exercise;

import java.util.Scanner;

//구조적 프로그래밍 , 한눈에 파악 가능~
public class Exercise_ScoreProgram_T {
	
	static int kor = 0; //static 전역변수=class변수 (파란글씨)
	static int eng = 0;
	static int math = 0; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ESCAPE : 
		while (true) {
			printMenu(); //ctrl누르고 클릭해보기
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
		System.out.println("=====메인 메뉴=====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.println("선택 : ");
	}
	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====성적 입력=====");
		System.out.println("국어 : ");
		kor = sc.nextInt();
		System.out.println("영어 : ");
		eng = sc.nextInt();
		System.out.println("수학 : ");
		math = sc.nextInt();	
	}
	public static void printScore() {
		System.out.println("=====성적 출력=====");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println();
		int sum = kor + eng + math;
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f \n",(double) sum / 3); 
	}
	public static void goodBye() {
		System.out.println(">>~~Good Bye~~<<");
	}
	public static void printException() {
		System.out.println("1, 2, 3 중에 선택하세요.");
	}
}
