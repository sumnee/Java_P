package com.kh.day10.wrapperex;

public class Exam_Wrapper {
	public static void main(String[] args) {
		//Wrapper ��ü�κ��� �⺻Ÿ�� �� �˾Ƴ���
		
		Integer i = Integer.valueOf(1123);  //�񽺵��Ѱ�=static
		//��ü�� ���
		
		int e = i.intValue();
		//�⺻������ ��ȯ
		
		Integer f = null; //��ü�� ����
//		int m = null;		 null �ֱ� �Ұ���
		
		Character c = Character.valueOf('c'); //��ü
		char che = c.charValue();			  //�⺻������ ��ȯ
		
		Double d = Double.valueOf(3.14);   //��ü
		double dd = d.doubleValue();	//�⺻������ ��ȯ
		
		
		
		//���ڿ��� �⺻������Ÿ��(int, boolean, double)���� ��ȯ
		int num = Integer.parseInt("123"); 			 //String -> int
		int result = num + 1; 						 //����ϱ� ���� int�� ��ȯ�Ѵ�
		System.out.println(result);
		
		boolean isYn = Boolean.parseBoolean("true"); //String -> boolean
		double fNum = Double.parseDouble("3.14");	 //String -> double
		
		
		//�⺻������Ÿ���� ���ڿ��� ��ȯ
		String data1 = Integer.toString(123);		 //int -> String
		String data2 = Integer.toHexString(123); 	 //16������ ��ȯ
		String data3 = Double.toString(3.14);		 //double -> String
		String data4 = Character.toString('a');		 //char -> String
		String data5 = Boolean.toString(true);		 //boolean -> String
	}
}
