package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String[] args) {
		// ���� ȥ�� �غ���, �ٽ� �ϸ鼭 ������ �غ���

		/*
		 * ====== ���� �޴� ======= 1. �����Է� 2. ������� 3. ���� ���� : 1
		 * 
		 * ====== ���� �Է� ======= ���� : 50 ���� : 40 ���� : 30
		 * 
		 * 
		 * ====== ���� �޴� ======= 1. �����Է� 2. ������� 3. ���� ���� : 2
		 * 
		 * ====== ���� ��� ====== ���� : 50 ���� : 40 ���� : 30
		 * 
		 * ���� : 120 ��� : 40.00
		 * 
		 * ====== ���� �޴� ======= 1. �����Է� 2. ������� 3. ���� ���� : 3
		 * 
		 * Good Bye~
		 * 
		 */

		Scanner sc = new Scanner(System.in);
	
		int kor = 0;
		int eng = 0;
		int math = 0; //while �ȿ� ������ �Է��ص� �ڲ� 0���� �Ǵϱ� ������ ����

		EXIT:  //3�������� while���� ������ ���α׷��� ����ǵ���(�� escape �ƴ϶� ��������, ���̶� �����ֱ⸸ �ϸ��)
			while (true) {
			System.out.println("=====���� �޴�=====");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			System.out.println("���� : ");
			int input = sc.nextInt();
			
			switch (input) {
			case 1:
				System.out.println("=====���� �Է�=====");
				System.out.println("���� : ");
				kor = sc.nextInt();
				System.out.println("���� : ");
				eng = sc.nextInt();
				System.out.println("���� : ");
				math = sc.nextInt();
				break;

			case 2:
				System.out.println("=====���� ���=====");
				System.out.println("���� : " + kor);
				System.out.println("���� : " + eng);
				System.out.println("���� : " + math);

				System.out.println();
				int sum = kor + eng + math;
				System.out.println("���� : " + sum);
				System.out.printf("��� : %.2f \n", (double) sum / 3); //�Ҽ��� ���ڸ����� ������ %f=�Ǽ� .2 = �Ҽ������ڸ�  \n = ����
				break;

			case 3:
				System.out.println(">>~~Good Bye~~<<");
				break EXIT; //3�������� while���� ��������

			default:
				System.out.println("1, 2, 3 �߿� �����ϼ���.");
				break;

			}
		}
	}
}
