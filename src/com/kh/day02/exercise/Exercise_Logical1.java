package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력한 정수가 1~100사이에 들어가는가?
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		boolean result1 = (1 < num) && (num < 100);
		System.out.println(result1);
		
		 // 입력받은 알파벳이 대문자인가? (아스키코드 상 숫자로 대문자 판별) 
		System.out.print("알파벳을 입력해주세요 : ");
		char word = sc.next().charAt(0);
		boolean result2 = (65 <= word) && (word <= 90);
		// boolean result2 = ('A' <= word) && (word <= 'Z'); 이것도 가능
		System.out.println(result2);
		
	}

}
