package com.kh.day11.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {

	public static void main(String[] args) {
		String query = "name=sia&addr=seoul&age=3";
//		StringTokenizer st = new StringTokenizer(query, "&");
		StringTokenizer st = new StringTokenizer(query, "&=");
		while(st.hasMoreTokens()) { 				//token이 있을때까지 while문 돌게
			System.out.println(st.nextToken());
		}

	}

}
