package com.kh.day10.interfaceex;

public interface PhoneInterface {
	public String NAME = ""; //public 만 가능, static final 생략된 상태
	//상수 명명은 대문자! 기울어진 것은 static의 영향 
	public static final int Time_Out = 10000; //static, final = 변수 사용 불가능, 상수값만 가능

	public abstract void sendCall(); 
	public void receiveCall(); 	//abstract 생략
	abstract void printLogo();  //public 생략
	void displayNumber(); 		//public, abstract 생략 
	public default void showLogo() { 
		System.out.println("** Samsung **");
	}	
		//디폴트 메소드는 바디( = { }) 사용
		//하위 호환성을 위해 작성
		//하위 호환성 유지하며 인터페이스 보완을 위해
		
	
}
//인터페이스 : 상수필드 + 추상메소드 + 디폴트메소드