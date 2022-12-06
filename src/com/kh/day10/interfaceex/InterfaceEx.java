package com.kh.day10.interfaceex;

public class InterfaceEx {

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.displayNumber();
		phone.sendCall();
		phone.receiveCall();
		phone.showLogo();
		phone.flash();
	}

}
