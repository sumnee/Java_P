package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Switch {

	public static void main(String[] args) {

		// 1입력 2수정 3조회 4삭제 0종료

		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("0. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("입력메뉴입니다.");
			break;
		case 2:
			System.out.println("수정메뉴입니다.");
			break;
		case 3:
			System.out.println("조회메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제메뉴입니다.");
			break;
		case 0:
			System.out.println("종료되었습니다.");
			break;
		default:
			System.out.println("0 ~ 4 사이의 숫자를 입력하세요.");
		}

	}

}
