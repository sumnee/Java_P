package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_If {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = ""; //각각 출력하지 않고 변수를 설정해 깔끔한 코드 짜기!
		
		if(num %2 == 0) {
			result = "짝수";
		}
		else {
			result = "홀수";
		}
		
		System.out.println(num + "은/는 " + result +"입니다.");
		
	}
}
