package com.kh.day11.javaapi;

public class Exam_StringBuffer {

	public static void main(String[] args) {
		//StringBuffer : 문자열을 연결해주는 클래스, 기존 객체를 사용하여 확장
		//concat : 문자열을 연결하는 메소드, 새로운 문자열 리턴
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("Java");
		
		System.out.println("연결된 문자열 : " + sb.toString()); //toString 스트링으로 만들어서 출력
		
		StringBuffer stb = new StringBuffer().append("KH").append(" Class").append(" F");
		System.out.println(stb.toString());
		
	}

}
