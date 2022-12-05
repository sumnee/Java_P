package com.kh.day09.point;

public class ColorPoint extends Point {
	private String color; //점의 색
	
//	public ColorPoint() {} --ColorPoint 클래스의 ColorPoint cp = new ColorPoint(); 를 위한 기본생성자
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);		 //x, y 세팅
		//Point의 생성자 Point(x, y) 호출
		this.color = color; 
	}
	
//	public void setColor(String color) {
//		this.color = color;
//	}
	
	public void showColorPoint() { //점의 좌표
		System.out.println(color);
		showPoint(); //부모 클래스의 메소드 호출
	}

}
