package com.kh.day11.wrapperex;

public class Exam_Wrapper {
	public static void main(String[] args) {
		
		int num=0;
		Integer num1 = Integer.valueOf(0);
		
		System.out.println(Character.toLowerCase('A')); //�빮�ڸ� �ҹ��ڷ� �������
		
		char c1 = '4', c2 = 'F';
		
		if(Character.isDigit(c1)) {						//�������� üũ
			System.out.println(c1 + "�� ����");				
		}
		
		if(Character.isAlphabetic(c2)) {				//���ĺ����� üũ
			System.out.println(c2 + "�� ������");
		}
		
		//������ -> static = static �������� �ҷ��ͼ� ����ϰԵ�
	}
}
