package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While2 {

	public static void main(String[] args) {
		// 정수 하나 입력 받아서 그 수가 1-9사이면 그 수의 구구단을 출력하세요
		// 1-9 아니면 오류메세지 출력
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if((num>=1)&&(num<=9)) {
			int i = 1;			
			while(i <= 9) {
				System.out.println(num + " * " + i);
				i++;
			}
		} else {
			System.out.println("1~9 사이의 정수를 입력하세요");		
		}
	}
	}

}
