package com.kh.day09.point;

public class ColorPoint extends Point {
	private String color; //���� ��
	
//	public ColorPoint() {} --ColorPoint Ŭ������ ColorPoint cp = new ColorPoint(); �� ���� �⺻������
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);		 //x, y ����
		//Point�� ������ Point(x, y) ȣ��
		this.color = color; 
	}
	
//	public void setColor(String color) {
//		this.color = color;
//	}
	
	public void showColorPoint() { //���� ��ǥ
		System.out.println(color);
		showPoint(); //�θ� Ŭ������ �޼ҵ� ȣ��
	}

}
