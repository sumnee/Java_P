package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction {
	Student students[];

	public StudentFunction() {
		students = new Student[3];
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== �л� ���� Ȯ�� ���α׷� =====");
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� ���� Ȯ��");
		System.out.println("4. ����");
		System.out.print("�޴� �Է� : ");
		int menu = sc.nextInt();
		return menu; // ���� �α�: void �ڸ��� ��ȯ�� int �ȽἭ ������
	}

	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("===== " + (i + 1) + "��° �л� ���� �Է� =====");
			System.out.println("�л� �̸� �Է� : ");
			String name = sc.next();
			System.out.println("1�� ���� �Է� : ");
			int firstScore = sc.nextInt();
			System.out.println("2�� ���� �Է� : ");
			int secondScore = sc.nextInt();
			students[i] = new Student();
			students[i].setName(name);
			students[i].setFirstScore(firstScore);
			students[i].setSecondScore(secondScore);
		}
	}

	public void printScore() {
		for (int i = 0; i < students.length; i++) {
			System.out.println("===== " + (i + 1) + "��° �л� ���� ���");
			System.out.println(students[i].getName() + "�л��� ������");
			System.out.println(
					"1�� ���� : " + students[i].getFirstScore() + " / 2�� ���� : " + students[i].getSecondScore() + "�Դϴ�.");
		}
	}

	public void checkPass() {    //////////////////////������� �ٽ�!
		/*
		 * ���� ���δ� 1�� 2���� ���� �ٸ��� / �� ������ 40���� �Ѿ���� - ���� 
		 * 1�� 2���� ����� 60�� �Ѿ���� - ��� 60�̸��ΰ�� 60���̸��� ���� ����
		 */
		for (int i = 0; i < students.length; i++) {
			int num1 = students[i].getFirstScore();
			int num2 = students[i].getSecondScore();
			double avg = (num1 + num2) / (double) 2;
			System.out.println(students[i].getName() + "�л��� ���� ���δ�");
			if (avg >= 60) {
				if(num1<40) { //���� 20 100 �̸� ��� 60�̶� ���� �߻�
					System.out.println("1�� ���� ���� ������Դϴ�."); 
				} else if (num2 < 40) {
					System.out.println("2�� ���� ���� ������Դϴ�.");
				} else {
					System.out.println("����Դϴ�.");
				}
			} else {
				if (num1 < 60) {
					System.out.println("1�� ���� ���� ������Դϴ�.");
				}
				if (num2 < 60) {
					System.out.println("2�� ���� ���� ������Դϴ�.");
				} 

			}
		}
	}

	public void printBye() {
	}

	public void printException() {
	}
}
