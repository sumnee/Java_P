package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {

	public void exercise1() {
		// 길이가 100인 배열, 1~100값 넣기 출력

		int arr[] = new int[100];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
			
		System.out.print(arr[i] + " ");
		}
	
	}

	public void exercise2() {

		// 길이 5인 배열, 딸기 복숭 키위 사과 바나나 하고 바나나 찾기 
		String[] fruits = new String[5];
		fruits[0] = "딸기";
		fruits[1] = "복숭아";
		fruits[2] = "키위";
		fruits[3] = "사과";
		fruits[4] = "바나나";

		// String[] fruitGoods = { "딸기", "복숭아", "키위", "사과", "바나나" }; 할당과 초기화 동시에!

		for (int i = 0; i < fruits.length; i++) {
			if(fruits[i] == "바나나") {
				System.out.print(fruits[i]);
			}
		}

	}

	public void exercise3() {
		// 양의정수 5개를 입력받아 저장하고 평균을 구해 출력 

		Scanner sc = new Scanner(System.in);
		int nums[] = new int [5];
		int sum = 0;
		System.out.println("정수 5개를 입력하세요 : ");
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		
		System.out.println("입력한 수의 평균 : " + (double) sum / nums.length); // sum을 강제형변환해서 실수로		
		
	}

	public void exercise4() {
		// 양의정수5개 저장하고 제일큰수 출력 -- 다시해보기

		int arr[] = new int[5];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요");
		for(int i =0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>max) {
				max = arr[i];
			}
		}

		System.out.println("입력한 수 중에 가장 큰 정수 : " + max);
	}

	public void exercise5() {

		// 주민등록번호 입력받아 출력, 성별 뒷자리는 *로

		char origin[] = new char[14];

		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요 (-포함하여) : ");
		String num = sc.next();

		for (int i = 0; i < origin.length; i++) {
			origin[i] = num.charAt(i);
		}
		// char show[] = origin; 	// 얕은 복사(주소 복사)
		char show[] = new char[14]; // 깊은 복사(배열 공간 만들어 데이터 복사)
		for (int i = 0; i < origin.length; i++) {
			if (i < 8) {
				show[i] = origin[i];
			} else {
				show[i] = '*';	
			}
			System.out.print(show[i]);
		}

	}
	public void exercise6() {
		int nums[] = {1, 2, 3, 4, 5};
		for(int num : nums) { //for-each문 
			System.out.print(num + " ");
		}
		
	}
	public void exercise7() {
		String fruits[] = {"딸기", "바나나", "복숭아", "귤", "체리", "오렌지"};
		for(String fruit : fruits) {
			System.out.print(fruit + " ");
		}
				
	}
}
