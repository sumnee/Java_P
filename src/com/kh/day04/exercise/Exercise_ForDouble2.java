package com.kh.day04.exercise;

public class Exercise_ForDouble2 {

	public static void main(String[] args) {
		// 0�� 0�к��� 23�� 59�б��� ����ϱ�
		
		for (int hour=0; hour<24; hour++) {
			for (int min = 0; min<60; min++) {
				System.out.print(hour + "�� " + min + "�� ");
				//System.out.printf("%2d�� %2d��\n", i, j);  --�̰͵� ����,�ڸ��� ����
			}
		}

	}

}
