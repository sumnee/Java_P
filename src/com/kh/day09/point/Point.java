package com.kh.day09.point;

public class Point {
	public int pub;
	protected int pro;
	int def;
	private int pri;
	
	private int x, y;
	
	public Point() { 				//�⺻������
		this.x = this.y = 0;
	}
	
	public Point(int x ,int y) {	// �Ű������� �ִ� ������
		this.x = x;
		this.y = y;
	}
	
//	public void set(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
	
	public void showPoint() { //���� ��ǥ
		System.out.println("(" + x + " , " + y +")");
	}

}
