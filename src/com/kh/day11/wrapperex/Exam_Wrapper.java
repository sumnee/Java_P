package com.kh.day11.wrapperex;

public class Exam_Wrapper {
	public static void main(String[] args) {
		
		int num=0;
		Integer num1 = Integer.valueOf(0);
		
		System.out.println(Character.toLowerCase('A')); //대문자를 소문자로 만들어줌
		
		char c1 = '4', c2 = 'F';
		
		if(Character.isDigit(c1)) {						//숫자인지 체크
			System.out.println(c1 + "은 숫자");				
		}
		
		if(Character.isAlphabetic(c2)) {				//알파벳인지 체크
			System.out.println(c2 + "는 영문자");
		}
		
		//기울어짐 -> static = static 영역에서 불러와서 사용하게됨
	}
}
