package com.kh.day07.student;

import java.util.Scanner;

public class StudentFunction {
	
	Student student; //���� ����
	
	public StudentFunction() { //������: ��ü ����, �ʱ�ȭ(��������� �� ����)
		student = new Student();
	}
	/**
	 * �л����� ���α׷� �޴� ���
	 * @return choice
	 */
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" =====�л� ���� ���� ���α׷� =====");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. ���α׷� ����");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		return choice; // ��ȯ�� �ʿ�~ void ��� int
	}
	/**
	 * �л� ���� �Է�
	 */
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" =====�л� ���� �Է� =====");
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("�������� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("�������� �Է� : ");
		int eng = sc.nextInt();
		System.out.print("�������� �Է� : ");
		int math = sc.nextInt();
		//student = new Student(name, kor, eng, math); -�ѹ���
		student.setName(name); // -����
		student.setKor(kor);
		student.setEng(eng);
		student.setMath(math);
	}
	/**
	 * �л� ���� ���
	 */
	public void printScore() {
		System.out.println("=====�л� ���� ���=====");
		System.out.println(student.getName() + "�л��� ����");
		System.out.println("���� ���� : " + student.getKor());
		System.out.println("���� ���� : " + student.getEng());
		System.out.println("���� ���� : " + student.getMath());
		System.out.println("=========================");
	}
	
	public void goodBye() {
		System.out.println("**~~>>Good Bye<<~~**");
	}
	
	public void printException() {}
}
