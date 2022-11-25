package com.kh.day02.variable;

public class TestDataType {
	public static void main(String [] args) {
		
		/*
		 
		0000 0000 한 자리는 bit, 보통 8개씩 묶어서 8bit=1byte
		 
		-정수
		맨 앞의 비트는 부호
		
		byte bNum = 127; // -128~127 (1byte)
		short sNum = 32767; // -32768~32767 (2byte)
		int iNum = 1; // -2147483648~2147483647 (4byte)
		long lNum = 2l; // 접미사 "l"을 붙여야함, int 이상 아주 길게 가넝 (8byte)
		
		-실수
		float fNum = 21.111f; // 접미사 "f"를 붙여야함 (4byte)
		double dNum = 25.48; // 평균 구할때 많이 사용 (8byte)
		
		-문자
		char fChar = 'L'; // '' 한개의 문자만 넣을 수 있음 (2byte)
		String sChar = "Latte"; // "" 문자열 가능
		
		-논리
		boolean result = true; // true false, 비교연산자에 많이 사용 (1byte)
			 
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
		
		char bChar = 66; // ASCII 아스키 코드
		System.out.println(bChar);
		
	}

}
