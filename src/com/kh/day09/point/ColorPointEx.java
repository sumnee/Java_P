package com.kh.day09.point;

public class ColorPointEx {

	public static void main(String[] args) {
//		ColorPoint cp = new ColorPoint(); 
		// ㄴThe constructor ColorPoint() is undefined - ColorPoint의 기본생성자 필요
		
//		cp.set(3,  4); 			//Point의 set()
//		cp.setColor("red"); 	//ColorPoint의 setColor()
//		cp.showColorPoint(); 	//출력
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
	}

}
