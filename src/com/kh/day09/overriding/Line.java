package com.kh.day09.overriding;

public class Line extends Shape {

	@Override //오버라이딩 한다는 표시
	public void draw() {
		System.out.println("Line"); //재정의 == 오버라이딩
	}
}
