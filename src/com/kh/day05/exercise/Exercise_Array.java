package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {

	public void exercise1() {
		// ���̰� 100�� �迭, 1~100�� �ֱ� ���

		int arr[] = new int[100];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
			
		System.out.print(arr[i] + " ");
		}
	
	}

	public void exercise2() {

		// ���� 5�� �迭, ���� ���� Ű�� ��� �ٳ��� �ϰ� �ٳ��� ã�� 
		String[] fruits = new String[5];
		fruits[0] = "����";
		fruits[1] = "������";
		fruits[2] = "Ű��";
		fruits[3] = "���";
		fruits[4] = "�ٳ���";

		// String[] fruitGoods = { "����", "������", "Ű��", "���", "�ٳ���" }; �Ҵ�� �ʱ�ȭ ���ÿ�!

		for (int i = 0; i < fruits.length; i++) {
			if(fruits[i] == "�ٳ���") {
				System.out.print(fruits[i]);
			}
		}

	}

	public void exercise3() {
		// �������� 5���� �Է¹޾� �����ϰ� ����� ���� ��� 

		Scanner sc = new Scanner(System.in);
		int nums[] = new int [5];
		int sum = 0;
		System.out.println("���� 5���� �Է��ϼ��� : ");
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		
		System.out.println("�Է��� ���� ��� : " + (double) sum / nums.length); // sum�� ��������ȯ�ؼ� �Ǽ���		
		
	}

	public void exercise4() {
		// ��������5�� �����ϰ� ����ū�� ��� -- �ٽ��غ���

		int arr[] = new int[5];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ���");
		for(int i =0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>max) {
				max = arr[i];
			}
		}

		System.out.println("�Է��� �� �߿� ���� ū ���� : " + max);
	}

	public void exercise5() {

		// �ֹε�Ϲ�ȣ �Է¹޾� ���, ���� ���ڸ��� *��

		char origin[] = new char[14];

		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ��� (-�����Ͽ�) : ");
		String num = sc.next();

		for (int i = 0; i < origin.length; i++) {
			origin[i] = num.charAt(i);
		}
		// char show[] = origin; 	// ���� ����(�ּ� ����)
		char show[] = new char[14]; // ���� ����(�迭 ���� ����� ������ ����)
		for (int i = 0; i < origin.length; i++) {
			if (i < 8) {
				show[i] = origin[i];
			} else {
				show[i] = '*';	
			}
			System.out.print(show[i]);
		}

	}
	public void exercise6() {
		int nums[] = {1, 2, 3, 4, 5};
		for(int num : nums) { //for-each�� 
			System.out.print(num + " ");
		}
		
	}
	public void exercise7() {
		String fruits[] = {"����", "�ٳ���", "������", "��", "ü��", "������"};
		for(String fruit : fruits) {
			System.out.print(fruit + " ");
		}
				
	}
}
