package com.kh.day04.exercise;

public class Exercise_PrintSample {

	public static void main(String[] args) {
		
		//System.out.println(����+���ڿ�) �� ����� �ȵǰ� ���ڿ��� �ȴ�.(�ڵ�����ȯ)
		
		System.out.println(2 + 1);
		System.out.println(2 + "1");
	
		//����+����
		System.out.println('2' + '1'); // �ƽ�Ű�ڵ� ǥ�� ���ڷ� ���
		System.out.println("2" + "1");
		
		//����+����+���ڿ�+���� ---> ���ڿ�
		System.out.println(2 + 2 + "hello" + 1);
		
		
		/*
		printf: �� ��ġ�� ���Ĺ��ڷ� ��������� "," ���� ������ ���
		print: �ٹٲ� ����
		println: �ٹٲ� ����
		\n �ٹٲ�
		 */ 
		
		System.out.printf("���� ��� : %d \n",1); // %d ����
		System.out.printf("���ڿ� ��� : %s","Coffee"); // %s ���ڿ�
		
	}

}