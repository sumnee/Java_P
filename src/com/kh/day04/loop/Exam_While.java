package com.kh.day04.loop;

public class Exam_While {

	public static void main(String[] args) {
		int i = 0; //while 문은 외부에서 초기화 해야함 (for문은 가능했음)
		while(i < 10) {
			System.out.print(i);
			i++;
		}
		System.out.println(); // 줄바꾸기 하려고
		
		int j = 9;
		while(j>=0) {
			System.out.print(j);
			j--;
		}
	}

}
