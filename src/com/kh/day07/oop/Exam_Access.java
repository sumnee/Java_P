package com.kh.day07.oop;

class Sample {
	public int a;
	private int b;
	int c; //(default)
}

public class Exam_Access {

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10; //���� ���� -��� ����
//		sample.b = 10; ���ٺҰ��� - ���� Ŭ���� �� ����
		sample.c = 10; //���ٰ��� -���� ��Ű�� ��

	}

}
