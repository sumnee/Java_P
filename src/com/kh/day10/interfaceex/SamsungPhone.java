package com.kh.day10.interfaceex;

public class SamsungPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("�ѷ���");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}

	@Override
	public void printLogo() {
		System.out.println("Samsung Smart");
	}

	@Override
	public void displayNumber() {
		System.out.println("010-****-****");
	}
	
	//�������̵� ���� �Ϲ� �޼ҵ� �߰� ����
	public void flash() {
		System.out.println("��¦��¦");
		
	}

}
