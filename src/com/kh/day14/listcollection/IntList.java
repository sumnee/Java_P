package com.kh.day14.listcollection;

import java.util.Arrays;

public class IntList {

	private int nums[];			//선언
	private int size;			//요소 갯수

	public IntList() {			//초기화 (생성자)
		nums = new int[3];
		size = 0;
	}
	
	private void resize() {
		int arr_capacity = nums.length;
		
		//용량이 꽉 찰 경우, 용량을 2배로
		int new_capacity = arr_capacity * 2;
		//새롭게 배열 만들어줌
		nums = Arrays.copyOf(nums, new_capacity); //배열을 복사해줌
		
	}
	
	public void add(int input) {
		
		//꽉차있는 상태라면 크기 재할당하여 배열 생성
		if(size == nums.length) {
			resize();
		}
		//마지막 위치에 요소 추가
		nums[size] = input;
		size++;
	}
	
	public int get(int index) {	
		return nums[index];
	}
	
	public int size() { 		//크기 조회
		return size;
	}
	
	public void clear() { 		//값 삭제
		nums = new int[3];
		size = 0;
	}

}
