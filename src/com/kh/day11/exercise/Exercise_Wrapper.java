package com.kh.day11.exercise;

public class Exercise_Wrapper {
	public void paserExample() {
		//num2-num1
		
		String strNum1 = "221123";
		String strNum2 = "230502";
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num2 - num1;
	
		System.out.println(result);
	}
	
	public void dataParsongExample() {
		//1�� byte, short, int, long����
		//2�� floar, double��
		//3�� char�� ��ȯ
		String strData1 = "13";
		String strData2 = "23.502";
		String strData3 = "Spring";
		
		byte num1 = Byte.parseByte(strData1);
		short num2 = Short.parseShort(strData1);
		int num3 = Integer.parseInt(strData1);
		long num4 = Long.parseLong(strData1);
		
		float num5 = Float.parseFloat(strData2);
		double num6 = Double.parseDouble(strData2);
		
		char bom = strData3.charAt(0); //���ڿ��� ���ڷ� �ٲٴ� ��
	}
	
	
}
