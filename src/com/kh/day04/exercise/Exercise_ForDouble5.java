package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ForDouble5 {

	public static void main(String[] args) {
		// 노션 별찍기2 ㅠㅠ 틀림 다시확인하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		int i;
		int j;
		
		for(i=num; i>0;i--) {
			for(j=num; j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
