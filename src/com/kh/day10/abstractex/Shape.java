package com.kh.day10.abstractex;

abstract class Line extends Shape{
	public void draw() {}
}

public abstract class Shape {
	public Shape() {} // ������
	public void paint() {}
	abstract public void draw(); //�߻�޼ҵ�� {} ���� ���
	
	//�߻� �޼ҵ�� �߻� Ŭ������ �־����
	//The abstract method draw in type Shape can only be defined by an abstract class

}
