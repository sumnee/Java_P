package com.kh.day11.wrapperex;

public class Exam_BoxingUnBoxing {

	public static void main(String[] args) {
		
		Integer num = Integer.valueOf(0);	// ->int(기본형)를 String(객체)으로
		//Boxing(자동 박싱)
		Integer su = 100;
		
		int soo = num.intValue();  			// ->Sting을 int로
		//UnBoxing(자동 언박싱)
		soo = num;
		
		int n = 10;
		Integer intObject = n;				//boxing
		System.out.println("intObject : " + intObject);
		
		int m = intObject + 10;				//unboxing
		System.out.println("m = " + m);

	}

}
