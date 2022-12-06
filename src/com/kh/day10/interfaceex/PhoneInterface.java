package com.kh.day10.interfaceex;

public interface PhoneInterface {
	public String NAME = ""; //public �� ����, static final ������ ����
	//��� ����� �빮��! ������ ���� static�� ���� 
	public static final int Time_Out = 10000; //static, final = ���� ��� �Ұ���, ������� ����

	public abstract void sendCall(); 
	public void receiveCall(); 	//abstract ����
	abstract void printLogo();  //public ����
	void displayNumber(); 		//public, abstract ���� 
	public default void showLogo() { 
		System.out.println("** Samsung **");
	}	
		//����Ʈ �޼ҵ�� �ٵ�( = { }) ���
		//���� ȣȯ���� ���� �ۼ�
		//���� ȣȯ�� �����ϸ� �������̽� ������ ����
		
	
}
//�������̽� : ����ʵ� + �߻�޼ҵ� + ����Ʈ�޼ҵ�