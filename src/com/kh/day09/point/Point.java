package com.kh.day09.point;

public class Point {
	public int pub;
	protected int pro;
	int def;
	private int pri;
	
	private int x, y;
	
	public Point() { 				//기본생성자
		this.x = this.y = 0;
	}
	
	public Point(int x ,int y) {	// 매개변수가 있는 생성자
		this.x = x;
		this.y = y;
	}
	
//	public void set(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
	
	public void showPoint() { //점의 좌표
		System.out.println("(" + x + " , " + y +")");
	}

}
