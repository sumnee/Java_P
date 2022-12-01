package com.kh.day04.exercise;

public class Exercise_PrintSample {

	public static void main(String[] args) {
		
		//System.out.println(정수+문자열) 시 계산이 안되고 문자열이 된다.(자동형변환)
		
		System.out.println(2 + 1);
		System.out.println(2 + "1");
	
		//문자+문자
		System.out.println('2' + '1'); // 아스키코드 표의 숫자로 계산
		System.out.println("2" + "1");
		
		//정수+정수+문자열+정수 ---> 문자열
		System.out.println(2 + 2 + "hello" + 1);
		
		
		/*
		printf: 들어갈 위치를 형식문자로 지정해줘야 "," 뒤의 내용이 출력
		print: 줄바꿈 없음
		println: 줄바꿈 있음
		\n 줄바꿈
		 */ 
		
		System.out.printf("정수 출력 : %d \n",1); // %d 정수
		System.out.printf("문자열 출력 : %s","Coffee"); // %s 문자열
		
	}

}