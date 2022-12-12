package com.kh.day14.listcollection;

import java.util.Arrays;

public class IntList {

	private int nums[];			//����
	private int size;			//��� ����

	public IntList() {			//�ʱ�ȭ (������)
		nums = new int[3];
		size = 0;
	}
	
	private void resize() {
		int arr_capacity = nums.length;
		
		//�뷮�� �� �� ���, �뷮�� 2���
		int new_capacity = arr_capacity * 2;
		//���Ӱ� �迭 �������
		nums = Arrays.copyOf(nums, new_capacity); //�迭�� ��������
		
	}
	
	public void add(int input) {
		
		//�����ִ� ���¶�� ũ�� ���Ҵ��Ͽ� �迭 ����
		if(size == nums.length) {
			resize();
		}
		//������ ��ġ�� ��� �߰�
		nums[size] = input;
		size++;
	}
	
	public int get(int index) {	
		return nums[index];
	}
	
	public int size() { 		//ũ�� ��ȸ
		return size;
	}
	
	public void clear() { 		//�� ����
		nums = new int[3];
		size = 0;
	}

}
