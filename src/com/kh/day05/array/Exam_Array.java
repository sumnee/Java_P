package com.kh.day05.array;

public class Exam_Array {

	public static void main(String[] args) {
		
		int num;
		int [] nums = new int[10]; 	//�迭 �����, �ʱ�ȭ
		nums[0] = 10;				//������ �Ҵ�
		nums[1] = 20;
		
		System.out.println(nums[0]);
		System.out.println(nums.length); //�迭�� ũ��
		
		for(int i=0;i<nums.length ;i++) {
			nums[i]=15;					//������ �Ҵ�
			System.out.print(nums[i] + " ");
		}
		
	}

}
