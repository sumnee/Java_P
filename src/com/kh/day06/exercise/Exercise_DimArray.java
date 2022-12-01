package com.kh.day06.exercise;

public class Exercise_DimArray {
	public void exercise1() { // 다시해보기
		// 5 4 3 2 1
		// 10 9 8 7 6
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21	
		
		int arrs[][] = new int[5][5];
		int k = 1;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = arrs.length - 1; j >= 0; j--) {
				arrs[i][j] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise2() { // 다시해보기
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21

		int arrs[][] = new int[5][5];
		int k = 1;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = arrs.length - 1; j >= 0; j--) {
				arrs[j][i] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise3() { // 다시해보기
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25

		int arrs[][] = new int[5][5];
		int k = 1;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs.length; j++) {
				arrs[j][i] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise4() {  // 다시해보기************************
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25

		// 0,0 0,1 0,2 0,3 0,4 -> 1,4 1,3 1,2 1,1 1,0 순서로 채워짐

		int arrs[][] = new int[5][5];
		int k = 1;
		for (int i = 0; i < arrs.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arrs[i].length; j++) {
					arrs[i][j] = k;
					k++;
				}
			} else {
				for (int j = arrs[i].length-1; j >= 0; j--) {
					arrs[i][j] = k;
					k++;
				}

			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise5() {
		// 2차원 배열에 학년별 12학기 성적 저장하고 4년간전체 평균 출력

		double score[][] = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } };
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
		}
		int sero = score.length;
		int garo = score[0].length;
		System.out.println("전체 평점 평균은 : " + sum / (sero*garo));
	}

}
