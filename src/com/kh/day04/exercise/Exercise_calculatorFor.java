package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_calculatorFor {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int count = 0; // 마지막에 카운트로 횟수 제한 걸기위해 선언
			for(;;) {  //한번 계산이 끝나도 계속 반복하도록!
			
			System.out.print("정수1번을 입력하세요 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2번을 입력하세요 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자를 입력하세요 : ");
			char oper = sc.next().charAt(0);
			
			int result = 0;
			
			switch (oper) {
			case '+':
				result = num1 + num2;
				break;
				
			case '-':
				result = num1 - num2;
				break;
				
			case '*':
				result = num1 * num2;
				break;
				
			case '/':
				result = num1 / num2;
				break;
				
			case '%':
				result = num1 % num2;
				break;
			}
			
			System.out.println(num1 + " " + oper + " " + num2 + " " + "=" + " " + result);
			count++;
			if(count ==3) break; //3번 돌고 끝나게!
		}

	}

}
