package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String[] args) {
		// 내가 혼자 해본것, 다시 하면서 수정도 해보기

		/*
		 * ====== 메인 메뉴 ======= 1. 성적입력 2. 성적출력 3. 종료 선택 : 1
		 * 
		 * ====== 성적 입력 ======= 국어 : 50 영어 : 40 수학 : 30
		 * 
		 * 
		 * ====== 메인 메뉴 ======= 1. 성적입력 2. 성적출력 3. 종료 선택 : 2
		 * 
		 * ====== 성적 출력 ====== 국어 : 50 영어 : 40 수학 : 30
		 * 
		 * 총점 : 120 평균 : 40.00
		 * 
		 * ====== 메인 메뉴 ======= 1. 성적입력 2. 성적출력 3. 종료 선택 : 3
		 * 
		 * Good Bye~
		 * 
		 */

		Scanner sc = new Scanner(System.in);
	
		int kor = 0;
		int eng = 0;
		int math = 0; //while 안에 있으면 입력해도 자꾸 0으로 되니까 밖으로 빼기

		EXIT:  //3번누르면 while문이 끝나고 프로그램이 종료되도록(꼭 escape 아니라도 ㄱㅊㄱㅊ, 끝이랑 맞춰주기만 하면댐)
			while (true) {
			System.out.println("=====메인 메뉴=====");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.println("선택 : ");
			int input = sc.nextInt();
			
			switch (input) {
			case 1:
				System.out.println("=====성적 입력=====");
				System.out.println("국어 : ");
				kor = sc.nextInt();
				System.out.println("영어 : ");
				eng = sc.nextInt();
				System.out.println("수학 : ");
				math = sc.nextInt();
				break;

			case 2:
				System.out.println("=====성적 출력=====");
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);

				System.out.println();
				int sum = kor + eng + math;
				System.out.println("총점 : " + sum);
				System.out.printf("평균 : %.2f \n", (double) sum / 3); //소수점 두자리까지 나오게 %f=실수 .2 = 소수점두자리  \n = 개행
				break;

			case 3:
				System.out.println(">>~~Good Bye~~<<");
				break EXIT; //3번누르면 while문이 끝나도록

			default:
				System.out.println("1, 2, 3 중에 선택하세요.");
				break;

			}
		}
	}
}
