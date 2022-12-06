package com.kh.day10.interfaceex;

public class SamsungPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("뚜루루루");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

	@Override
	public void printLogo() {
		System.out.println("Samsung Smart");
	}

	@Override
	public void displayNumber() {
		System.out.println("010-****-****");
	}
	
	//오버라이딩 말고 일반 메소드 추가 가능
	public void flash() {
		System.out.println("반짝반짝");
		
	}

}
