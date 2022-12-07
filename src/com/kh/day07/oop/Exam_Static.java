package com.kh.day07.oop;


class StaticSample{
	public int num;
	public void sampleMathod() {
		input = 20;
	}
	public void goodMethod() {
		input = 30;
	}
	public static int input; 
	//변수 input이 메소드보다 아래 있어도 static 멤버는 클래스 로드 시 이미 할당완료
	public static void originMethod() {
		input = 5;
	}
}

public class Exam_Static {

	public static void main(String[] args) {
		new StaticSample().num = 10;
		StaticSample.input = 10; //input이 static멤버라서 new 없이 사용

		StaticSample s1;
		s1 = new StaticSample();
		System.out.println(s1.input);
		
		s1.originMethod();
		System.out.println(s1.input);
		
		
		int value = Math.abs(-5); //abs = 절대값 구하기
		System.out.println("값 : " + value);
	}

}
