package com.kh.day04.loop;

import java.util.Scanner;

public class Exam_DoWhile {

	public static void main(String[] args) {
		// 입력한 수가 -1일 될대까지 더하세요
		
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		
		do {
			System.out.print("정수를 입력하세요 : ");
			i = sc.nextInt();
			if(i==-1) continue;
			sum += i;
		} while(i != -1);

		System.out.println("입력한 수의 합은 " + sum);
	}

}
