package com.kh.day04.exercise;

public class Exercise_ForDouble2 {

	public static void main(String[] args) {
		// 0시 0분부터 23시 59분까지 출력하기
		
		for (int hour=0; hour<24; hour++) {
			for (int min = 0; min<60; min++) {
				System.out.print(hour + "시 " + min + "분 ");
				//System.out.printf("%2d시 %2d분\n", i, j);  --이것도 가능,자릿수 맞춤
			}
		}

	}

}
