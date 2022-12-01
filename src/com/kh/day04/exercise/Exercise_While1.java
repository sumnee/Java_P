package com.kh.day04.exercise;

public class Exercise_While1 {

	public static void main(String[] args) {
		//while문을 이용해서 1~100 사이 홀수의 합 출력하세용
		
		int num = 1;
		int sum = 0;
				
		while(num < 100) {			
			sum = sum + num;
			num += 2;		//num = num + 2
		}
		System.out.println(sum);
	}

}
