package com.kh.day07.oop;

public class Rectangle { //Ŭ���� ����, ���������� public
	//�ʵ�
	public int width;
	public int height;
	
	//�޼ҵ�
	public Rectangle() {} //������(��������)
	
	//�Ű������� �ִ� ������ (���ް��� ���� �� ����)
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//��ȯ���� �ִ� �޼ҵ�
	public int getArea() { 
		int area = width*height;
		return area; 
		//getArea�� ȣ���� ���� area���� ������(��ȯ�Ѵ�)
		//��ȯ �� �޼ҵ�� �ڷ����� ���ƾ��� (���⼭�� int)
	}

}
