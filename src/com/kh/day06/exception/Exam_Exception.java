package com.kh.day06.exception;

import java.util.Scanner;

public class Exam_Exception {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 입력 : ");
			int num2 = sc.nextInt();
			System.out.println("나누기 수행");
			int result = num1 / num2;
			System.out.println("몫은 " + result + "입니다~");

		} catch (ArithmeticException e) {
			System.out.println("0으로 나누면 안됩니다!");
		}

	}

}
