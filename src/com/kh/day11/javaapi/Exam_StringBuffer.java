package com.kh.day11.javaapi;

public class Exam_StringBuffer {

	public static void main(String[] args) {
		//StringBuffer : ���ڿ��� �������ִ� Ŭ����, ���� ��ü�� ����Ͽ� Ȯ��
		//concat : ���ڿ��� �����ϴ� �޼ҵ�, ���ο� ���ڿ� ����
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("Java");
		
		System.out.println("����� ���ڿ� : " + sb.toString()); //toString ��Ʈ������ ���� ���
		
		StringBuffer stb = new StringBuffer().append("KH").append(" Class").append(" F");
		System.out.println(stb.toString());
		
	}

}
