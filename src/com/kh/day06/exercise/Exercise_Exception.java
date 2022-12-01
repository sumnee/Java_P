package com.kh.day06.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {

	public void practice1() {
		while (true) { // ���ѹݺ�
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("���� �Է� : ");
				int num1 = sc.nextInt();
				System.out.print("���� �Է� : ");
				int num2 = sc.nextInt();
				System.out.println("������");
				int result = num1 / num2;
				System.out.println("���� " + result + "�Դϴ�~");
				break; // ���� ���� �� �ݺ� ����
			} catch (ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�");
			}

		}
	}

	public void practice2() {               /////////�� �ٽ� �غ���
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		for (int i = 1; i < 4; i++) {
			System.out.println(i + " >> ");
			try {
				num = sc.nextInt();		
			} catch(InputMismatchException e) {
				System.out.println("������ �Է��Ͻÿ�.");
				sc.next(); //�Էµ� ���������� ����, ������ ��� ����ȵ�
				i--; //���������� �ڸ��� �ٽ� �Է��ϵ���
				continue; //sum�� ���� �ʰ� �ǳʶٰ�!
			}
			sum += num;
		}
		System.out.println("���� : " + sum);
	}

}
