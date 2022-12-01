package com.kh.day06.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {

	public void practice1() {
		while (true) { // 무한반복
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("정수 입력 : ");
				int num1 = sc.nextInt();
				System.out.print("정수 입력 : ");
				int num2 = sc.nextInt();
				System.out.println("나누면");
				int result = num1 / num2;
				System.out.println("몫은 " + result + "입니다~");
				break; // 정상 실행 시 반복 종료
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다");
			}

		}
	}

	public void practice2() {               /////////꼭 다시 해보기
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		for (int i = 1; i < 4; i++) {
			System.out.println(i + " >> ");
			try {
				num = sc.nextInt();		
			} catch(InputMismatchException e) {
				System.out.println("정수만 입력하시오.");
				sc.next(); //입력된 오류데이터 제거, 변수가 없어서 저장안됨
				i--; //오류데이터 자리에 다시 입력하도록
				continue; //sum에 들어가지 않고 건너뛰게!
			}
			sum += num;
		}
		System.out.println("합은 : " + sum);
	}

}
