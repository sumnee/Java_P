package com.kh.day10.abstractex;

abstract class Line extends Shape{
	public void draw() {}
}

public abstract class Shape {
	public Shape() {} // 생성자
	public void paint() {}
	abstract public void draw(); //추상메소드는 {} 없이 사용
	
	//추상 메소드는 추상 클래스에 있어야함
	//The abstract method draw in type Shape can only be defined by an abstract class

}
