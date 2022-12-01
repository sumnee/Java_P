package com.kh.day07.oop;

public class Circle {
	//필드
	public int radius; //멤버변수 선언(접근 지정자 public)
	public String name;
	
	
	//메소드
	public Circle() { 
	//클래스명과 이름이 같은 메소드 => "생성자"
	//객체 생성, 필드 초기화해주는 역할 (생략 가능=선언 시 초기화)
	//생성자에서 초기화가 원칙이나, 편의 상 선언 시 초기화하는 것
		
		this.radius = 1; //초기화
		this.name = "원";
	}
	
	public double getArea() { //반환형(return)이 있는 메소드 / 리턴값의 자료형(double) 표기
		
		//return 3.14*radius*radius; 하기 내용과 변수 쓰냐안쓰냐의 차이
		
		double area = 3.14*radius*radius;
		return area;
	}

}
