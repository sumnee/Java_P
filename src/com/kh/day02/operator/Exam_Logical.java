package com.kh.day02.operator;

public class Exam_Logical {

	public static void main(String[] args) {
		/*��������
		
		AND && �Ѵ� ���̸� true
		OR || �ϳ� �̻� ���̸� true
		
		&& ���� �� ù���� F�̸� �������� �������� ���� (��� F)
		|| ���� �� ù���� T�̸� �������� �������� ���� (��� T)
		
		*/

		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4;
		
		result1 = (num1 != num2) && (num1 < num2);
		result2 = (num1 < num2) || (num1 == num2); 
		result3 = (num1 > num2) && (num1 != num2); 
		result4 = (num1 > num2) || (num1 == num2); 
		
		System.out.println("1�� ����� " + result1);
		System.out.println("2�� ����� " + result2);
		System.out.println("3�� ����� " + result3);
		System.out.println("4�� ����� " + result4);
		
		///////
		
		int aNum = 70;
		int bNum = 55;
		result1 = (aNum == bNum) || (aNum++ < 100);
		result2 = (aNum < bNum) && (--bNum < 55);
		result3 = (aNum != bNum) && (bNum-- < aNum++);
		result4 = (aNum++ != bNum) || (bNum++ >= 85);
		
		System.out.println("1�� ������� " + result1);
		System.out.println("2�� ������� " + result2);
		System.out.println("3�� ������� " + result3);
		System.out.println("4�� ������� " + result4);
		
		
	}

}
