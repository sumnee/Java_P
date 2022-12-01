package com.kh.day07.run;

import com.kh.day07.oop.Rectangle;

public class RectRun {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 20);
//		rect.width = 10;
//		rect.height = 20;
		System.out.println("넓이 : " + rect.getArea());

	}

}

//질문log) 
//crtl+space로 import 할 때 경로 잘 보고 하기
//경로를 틀려서 변수 오류가 났음
//class 탭에 * 붙는거는 저장 안했다는 뜻!
