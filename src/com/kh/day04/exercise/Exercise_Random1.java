package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {

	public static void main(String[] args) {
		// ���� �յ� ���߱�

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("=======���� �� �� ���߱�=======");
		System.out.print("���ڸ� �Է����ּ��� (1. �ո� / 2. �޸�) : ");
		int choice = sc.nextInt();

		int computer = rand.nextInt(2) + 1;

		System.out.println("��ǻ���� ���� : " + computer);
		
		if (computer == choice) {
			System.out.println("������ϴ�!!!");
		} else {
			System.out.println("Ʋ�Ƚ��ϴ� �̤�");

		}

	}

}
