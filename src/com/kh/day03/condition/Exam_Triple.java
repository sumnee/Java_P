package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Triple {

	public static void main(String[] args) {
		
		/* 삼항연산자 : 항목이 3개
		 * 참거짓을 반환하며 비교,논리 연산자를 주로 사용함
		 * (조건식) ? 참일때 : 거짓일때    <--형태       */
		 
		
		//정수를 입력받아 짝수인지 홀수인지 판별하는 프로그램 작성하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = (num %2 == 0) ? "짝수" : "홀수";
		
		System.out.println(num + " 은/는 " + result + "입니다.");
		
	}

}
