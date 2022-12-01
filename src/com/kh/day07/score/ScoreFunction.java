package com.kh.day07.score;

import java.util.Scanner;

public class ScoreFunction {
	private int kor; //멤버변수
	private int eng;
	private int math;
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====메인 메뉴=====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.println("선택 : ");
		int input = sc.nextInt();
		return input; //run메뉴로 보낸다
	}
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====성적 입력=====");
		System.out.println("국어 : ");
		kor = sc.nextInt();
		System.out.println("영어 : ");
		eng = sc.nextInt();
		System.out.println("수학 : ");
		math = sc.nextInt();	
	}
	public void printScore() {
		System.out.println("=====성적 출력=====");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println();
		int sum = kor + eng + math;
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f \n",(double) sum / 3); 
	}
	public void goodBye() {
		System.out.println("Good Bye~");
	}
	
	public void printException() {
		System.out.println("1, 2, 3 중에 선택하세요.");
	}

}
