package com.kh.day11.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {

	public void exercise1() {
		// ��ȭ/ȫ��/����/���� ���ڿ� �����͸� /�������� �߶� ���㸸 ���

		String data = "��ȭ/ȫ��/����/����";
		StringTokenizer st = new StringTokenizer(data, "/");
		while (st.hasMoreTokens()) {
			if (st.nextToken().equals("����")) {
				System.out.println("����");
			}
		}

	}
}
