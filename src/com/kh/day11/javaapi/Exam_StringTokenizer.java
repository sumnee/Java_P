package com.kh.day11.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {

	public static void main(String[] args) {
		String query = "name=sia&addr=seoul&age=3";
//		StringTokenizer st = new StringTokenizer(query, "&");
		StringTokenizer st = new StringTokenizer(query, "&=");
		while(st.hasMoreTokens()) { 				//token�� ���������� while�� ����
			System.out.println(st.nextToken());
		}

	}

}
