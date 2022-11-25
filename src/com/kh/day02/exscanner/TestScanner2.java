package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String[] args) {
		
		//입력받을 수 있는 데이터: 정수, 실수, 문자열, 문자(*)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int iNum = sc.nextInt();
		
		System.out.print("실수를 입력해주세요 : ");
		double dNum = sc.nextDouble();
		
		System.out.print("문자열을 입력해주세요 : ");
		String words = sc.next(); // 문자열은 그냥 넥스트
		
		System.out.print("문자를 입력해주세요 : ");
		char word = sc.next().charAt(0); // 문자열으로 받아서 charAT으로 뽑아쓰기
		
		//nextString, nextChar 없음!
		
		System.out.println("입력한 정수는 : " + iNum + "입니다.");
		System.out.println("입력한 실수는 : " + dNum + "입니다.");
		System.out.println("입력한 문자열은 : " + words + "입니다.");
		System.out.println("입력한 문자는 : " + word + "입니다.");
		
	}

}
