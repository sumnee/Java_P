package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_calculatorFor {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int count = 0; // �������� ī��Ʈ�� Ƚ�� ���� �ɱ����� ����
			for(;;) {  //�ѹ� ����� ������ ��� �ݺ��ϵ���!
			
			System.out.print("����1���� �Է��ϼ��� : ");
			int num1 = sc.nextInt();
			System.out.print("����2���� �Է��ϼ��� : ");
			int num2 = sc.nextInt();
			System.out.print("�����ڸ� �Է��ϼ��� : ");
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
			if(count ==3) break; //3�� ���� ������!
		}

	}

}
