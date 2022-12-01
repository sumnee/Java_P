package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.exercise.Exercise_Lotto;
import com.kh.day07.oop.Person;
import com.kh.day07.oop.Rectangle;

public class Run {

	public static void main(String[] args) {
	
//		Exercise_Lotto exLotto = new Exercise_Lotto();
//		exLotto.lottoProgram();
//		
//		Person person = new Person();
//		person.eat();
//		person.sleep();
//		person.speak();
//		person.walk();		
		//person.name="김철수"; - Person class 에서 public 선언했기땜시 가능
		
		Scanner sc = new Scanner(System.in); //객체생성, "new" 이용(객체의 생성자 호출)
		
		//레퍼런스 변수 선언
		//참조 변수 선언
		//주소가 저장되는 변수
		
		Rectangle rect = new Rectangle(); 
		
		System.out.print("너비 입력 : "); 
		//객체의 멤버 접근 "." 이용 (멤버는 변수와 메소드가 있음)
		//인스턴스(Rectangle 클래스의 객체)
		rect.width = sc.nextInt(); //멤버변수 접근
		System.out.print("높이 입력 : ");
		rect.height = sc.nextInt(); //멤버변수 접근
		int result = rect.getArea(); //멤버메소드 접근
		System.out.print("사각형 면적 : " + result);
	}

}
