package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //입력받을 준비
		
		System.out.print("int 값을 입력해주세요 : ");
		int input1 = sc.nextInt(); //nextInt 입력받은 값을 저장할 수 있음
		System.out.println("입력한 값 : " + input1);
		
		System.out.print("int 값을 한번 더 입력해주세요 : ");
		int input2 = sc.nextInt();
		System.out.println("입력한 값 : " + input2);

		int result = input1 + input2;
		System.out.println("두 값의 합은 " + result + "입니다.");
			
	}

}
