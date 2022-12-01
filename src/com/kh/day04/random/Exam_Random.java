package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {

	public static void main(String[] args) {
		
		Random rand = new Random();
		for(int i=0; i<10;i++) {
			System.out.println(rand.nextInt(10)+1);		
		}
		//nextInt()   0 ~ n-1 까지 랜덤수
		//nextInt()+1 1 ~ n   범위 조정 가능
		//ex) 20~35 --> nextInt(16)+20
		//ex) 10~23 --> nextInt(14)+10
	}

}
