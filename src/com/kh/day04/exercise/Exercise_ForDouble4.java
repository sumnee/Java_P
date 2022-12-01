package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ForDouble4 {

	public static void main(String[] args) {
		//노션 문제 별찍기1
		// 입력된 정수만큼 트리모양 별 찍기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	

	}

}
