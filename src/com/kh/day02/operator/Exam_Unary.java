package com.kh.day02.operator;

public class Exam_Unary {

	public static void main(String[] args) {
		
		// a++ 후위연산,나중연산 ++a 전위연산,먼저연산
		
		int a = 10;
		int b = 20;		
		int c = 30;
		
		a++;
		b = --a + b;
		c = a++ + --b;
		
		System.out.println("1번 문제");
		System.out.println("a++;");
		System.out.println("b = --a + b;");
		System.out.println("c = a++ + --b;"); 
		
		System.out.println("a의 값 : " + a);
		System.out.println("b의 값 : " + b);
		System.out.println("c의 값 : " + c); 
		
		System.out.println("-");
		
		int x = 100;
		int y = 33;		
		int z = 0;
		
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		
		System.out.println("x의 값 " + x);
		System.out.println("y의 값 " + y);
		System.out.println("z의 값 " + z); 
		
		boolean result = true;
		System.out.println(result);
		System.out.println(!result);
		
		}

}
