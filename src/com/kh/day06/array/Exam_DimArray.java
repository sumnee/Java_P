package com.kh.day06.array;

public class Exam_DimArray {

	public static void main(String[] args) {
		int arrs[][] = new int[4][4];
		int k = 1;
		
		System.out.println(arrs.length); 	//세로(행)의 크기
		System.out.println(arrs[0].length); //가로(열)의 크기

		for(int i=0;i<arrs.length;i++) {
			for(int j =0;j<arrs[i].length;j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		for(int i=0;i<arrs.length;i++) {
			for(int j =0;j<arrs[i].length;j++) {
				System.out.printf("%2d " ,arrs[i][j]); //두자리수 정렬, 출력
			}
			System.out.println();
		}
	}

}
