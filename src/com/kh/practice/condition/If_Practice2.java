package com.kh.practice.condition;

import java.util.Scanner;

public class If_Practice2 {

	public static void main(String[] args) {
		// 짝홀판별1
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		String result = " ";
	
		if(num %2 ==0) {
			result = "짝수입니다.";
		}
		else if (num %2 ==1) {
			result = "홀수입니다.";
		}
		System.out.println("입력한 정수는 " + result);
	}

}
