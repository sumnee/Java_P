package com.kh.day09.overriding;

public class Line extends Shape {

	@Override //�������̵� �Ѵٴ� ǥ��
	public void draw() {
		System.out.println("Line"); //������ == �������̵�
	}
}
