package com.kh.day07.oop;

class Sample {
	public int a;
	private int b;
	int c; //(default)
}

public class Exam_Access {

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10; //접근 가능 -모두 가능
//		sample.b = 10; 접근불가능 - 같은 클래스 내 가능
		sample.c = 10; //접근가능 -같은 패키지 내

	}

}
