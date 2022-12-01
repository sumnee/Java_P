package com.kh.day07.oop;

public class Rectangle { //클래스 선언, 접근지정자 public
	//필드
	public int width;
	public int height;
	
	//메소드
	public Rectangle() {} //생성자(생략가능)
	
	//매개변수가 있는 생성자 (전달값을 받을 수 있음)
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//반환형이 있는 메소드
	public int getArea() { 
		int area = width*height;
		return area; 
		//getArea를 호출한 곳에 area값을 보낸다(반환한다)
		//반환 시 메소드와 자료형이 같아야함 (여기서는 int)
	}

}
