package com.kh.day09.point;

public class ColorPointEx {

	public static void main(String[] args) {
//		ColorPoint cp = new ColorPoint(); 
		// ��The constructor ColorPoint() is undefined - ColorPoint�� �⺻������ �ʿ�
		
//		cp.set(3,  4); 			//Point�� set()
//		cp.setColor("red"); 	//ColorPoint�� setColor()
//		cp.showColorPoint(); 	//���
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
	}

}
