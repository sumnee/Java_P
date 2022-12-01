package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void lottoProgram() {
		// 로또번호 자동 생성기 프로그램, 중복 없이(i--) 6개(배열6개) 추출하기(random)
		// 결과는 오름차순 정렬 1~45범위

		int lotto[] = new int[6];
		Random rand = new Random();
		for (int i = 0; i < lotto.length; i++) { // 번호뽑기
			lotto[i] = rand.nextInt(45) + 1;
			for (int e = 0; e < i; e++) { // 점점 많은 횟수 비교해서 중복제거
				if (lotto[i] == lotto[e]) {
					i--; // 중복된 이번 i값 삭제
					break; //for문 빠져나가서 다시 뽑도록
				}
			}

		}

		for (int i = 0; i < lotto.length - 1; i++) { // 오름차순 정리, 버블정렬
			for (int j = 0; j < (lotto.length - 1) - i; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j + 1];
					lotto[j + 1] = lotto[j];
					lotto[j] = temp;
				}
			}
		}

		for (int i = 0; i < 6; i++) { //출력
			System.out.print(lotto[i] + " ");
		}

	}
}
