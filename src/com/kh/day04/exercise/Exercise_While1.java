package com.kh.day04.exercise;

public class Exercise_While1 {

	public static void main(String[] args) {
		//while���� �̿��ؼ� 1~100 ���� Ȧ���� �� ����ϼ���
		
		int num = 1;
		int sum = 0;
				
		while(num < 100) {			
			sum = sum + num;
			num += 2;		//num = num + 2
		}
		System.out.println(sum);
	}

}
