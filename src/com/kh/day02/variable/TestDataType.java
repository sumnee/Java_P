package com.kh.day02.variable;

public class TestDataType {
	public static void main(String [] args) {
		
		/*
		 
		0000 0000 �� �ڸ��� bit, ���� 8���� ��� 8bit=1byte
		 
		-����
		�� ���� ��Ʈ�� ��ȣ
		
		byte bNum = 127; // -128~127 (1byte)
		short sNum = 32767; // -32768~32767 (2byte)
		int iNum = 1; // -2147483648~2147483647 (4byte)
		long lNum = 2l; // ���̻� "l"�� �ٿ�����, int �̻� ���� ��� ���� (8byte)
		
		-�Ǽ�
		float fNum = 21.111f; // ���̻� "f"�� �ٿ����� (4byte)
		double dNum = 25.48; // ��� ���Ҷ� ���� ��� (8byte)
		
		-����
		char fChar = 'L'; // '' �Ѱ��� ���ڸ� ���� �� ���� (2byte)
		String sChar = "Latte"; // "" ���ڿ� ����
		
		-��
		boolean result = true; // true false, �񱳿����ڿ� ���� ��� (1byte)
			 
		 */
		
	
		int iNum = 2147483647; 
		long lNum = 2147483648l;
		float fNum = 22.1123f;
		double dNum = 23.502;
		char cChar = 'A';
		String sChar = "Hello Java";
		boolean result = false;
		
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(cChar);
		System.out.println(sChar);
		System.out.println(result);
		
		char bChar = 66; // ASCII �ƽ�Ű �ڵ�
		System.out.println(bChar);
		
	}

}
