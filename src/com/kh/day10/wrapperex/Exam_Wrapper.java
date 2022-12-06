package com.kh.day10.wrapperex;

public class Exam_Wrapper {
	public static void main(String[] args) {
		//Wrapper 객체로부터 기본타입 값 알아내기
		
		Integer i = Integer.valueOf(1123);  //비스듬한것=static
		//객체로 사용
		
		int e = i.intValue();
		//기본형으로 변환
		
		Integer f = null; //객체라서 가능
//		int m = null;		 null 넣기 불가능
		
		Character c = Character.valueOf('c'); //객체
		char che = c.charValue();			  //기본형으로 변환
		
		Double d = Double.valueOf(3.14);   //객체
		double dd = d.doubleValue();	//기본형으로 변환
		
		
		
		//문자열을 기본데이터타입(int, boolean, double)으로 변환
		int num = Integer.parseInt("123"); 			 //String -> int
		int result = num + 1; 						 //계산하기 위해 int로 변환한다
		System.out.println(result);
		
		boolean isYn = Boolean.parseBoolean("true"); //String -> boolean
		double fNum = Double.parseDouble("3.14");	 //String -> double
		
		
		//기본데이터타입을 문자열로 변환
		String data1 = Integer.toString(123);		 //int -> String
		String data2 = Integer.toHexString(123); 	 //16진수로 변환
		String data3 = Double.toString(3.14);		 //double -> String
		String data4 = Character.toString('a');		 //char -> String
		String data5 = Boolean.toString(true);		 //boolean -> String
	}
}
