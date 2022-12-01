package com.kh.day05.array;

public class Exam_Array {

	public static void main(String[] args) {
		
		int num;
		int [] nums = new int[10]; 	//배열 만들기, 초기화
		nums[0] = 10;				//데이터 할당
		nums[1] = 20;
		
		System.out.println(nums[0]);
		System.out.println(nums.length); //배열의 크기
		
		for(int i=0;i<nums.length ;i++) {
			nums[i]=15;					//데이터 할당
			System.out.print(nums[i] + " ");
		}
		
	}

}
