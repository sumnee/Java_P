package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void lottoProgram() {
		// �ζǹ�ȣ �ڵ� ������ ���α׷�, �ߺ� ����(i--) 6��(�迭6��) �����ϱ�(random)
		// ����� �������� ���� 1~45����

		int lotto[] = new int[6];
		Random rand = new Random();
		for (int i = 0; i < lotto.length; i++) { // ��ȣ�̱�
			lotto[i] = rand.nextInt(45) + 1;
			for (int e = 0; e < i; e++) { // ���� ���� Ƚ�� ���ؼ� �ߺ�����
				if (lotto[i] == lotto[e]) {
					i--; // �ߺ��� �̹� i�� ����
					break; //for�� ���������� �ٽ� �̵���
				}
			}

		}

		for (int i = 0; i < lotto.length - 1; i++) { // �������� ����, ��������
			for (int j = 0; j < (lotto.length - 1) - i; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j + 1];
					lotto[j + 1] = lotto[j];
					lotto[j] = temp;
				}
			}
		}

		for (int i = 0; i < 6; i++) { //���
			System.out.print(lotto[i] + " ");
		}

	}
}
