package com.kh.practice.condition;

import java.util.Scanner;

public class If_Practice1 {

	public static void main(String[] args) {
		//정수판별1
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		String result = " ";
		
		if(num>0) {
			result = "양수입니다.";
		}
		else if(num<0) {
			result = "음수입니다.";
		}
		else {
			result = "0입니다";
		}
		
		System.out.println(result);
	}

}
