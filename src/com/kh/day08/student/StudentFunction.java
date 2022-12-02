package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction {
	Student students[];

	public StudentFunction() {
		students = new Student[3];
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 학생 성적 확인 프로그램 =====");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 종료");
		System.out.print("메뉴 입력 : ");
		int menu = sc.nextInt();
		return menu; // 질문 로그: void 자리에 반환형 int 안써서 오류남
	}

	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("===== " + (i + 1) + "번째 학생 정보 입력 =====");
			System.out.println("학생 이름 입력 : ");
			String name = sc.next();
			System.out.println("1차 점수 입력 : ");
			int firstScore = sc.nextInt();
			System.out.println("2차 점수 입력 : ");
			int secondScore = sc.nextInt();
			students[i] = new Student();
			students[i].setName(name);
			students[i].setFirstScore(firstScore);
			students[i].setSecondScore(secondScore);
		}
	}

	public void printScore() {
		for (int i = 0; i < students.length; i++) {
			System.out.println("===== " + (i + 1) + "번째 학생 정보 출력");
			System.out.println(students[i].getName() + "학생의 점수는");
			System.out.println(
					"1차 점수 : " + students[i].getFirstScore() + " / 2차 점수 : " + students[i].getSecondScore() + "입니다.");
		}
	}

	public void checkPass() {    //////////////////////개어려움 다시!
		/*
		 * 재평가 여부는 1차 2차가 각각 다르다 / 각 점수는 40점을 넘어야함 - 과락 
		 * 1차 2차의 평균은 60점 넘어야함 - 평균 60미만인경우 60점미만인 과목 재평가
		 */
		for (int i = 0; i < students.length; i++) {
			int num1 = students[i].getFirstScore();
			int num2 = students[i].getSecondScore();
			double avg = (num1 + num2) / (double) 2;
			System.out.println(students[i].getName() + "학생의 재평가 여부는");
			if (avg >= 60) {
				if(num1<40) { //예외 20 100 이면 평균 60이라도 과락 발생
					System.out.println("1차 시험 재평가 대상자입니다."); 
				} else if (num2 < 40) {
					System.out.println("2차 시험 재평가 대상자입니다.");
				} else {
					System.out.println("통과입니다.");
				}
			} else {
				if (num1 < 60) {
					System.out.println("1차 시험 재평가 대상자입니다.");
				}
				if (num2 < 60) {
					System.out.println("2차 시험 재평가 대상자입니다.");
				} 

			}
		}
	}

	public void printBye() {
	}

	public void printException() {
	}
}
