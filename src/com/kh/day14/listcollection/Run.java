package com.kh.day14.listcollection;

import com.kh.day07.student.Student;

public class Run {

	public static void main(String[] args) {
		
		ObjectList objList = new ObjectList();
		objList.add(11);
		objList.add("��");
		
		int num = (int)objList.get(0); //Object���¸� �ٿ�ĳ����(����ȯ) �������
		String str = (String)objList.get(1);

	}

	public void intExample() {
		IntList nums = new IntList(); // Ŭ���� �ȿ� �޼ҵ带 �����Ͽ� ũ�� ��� ����

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);

		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
		System.out.println(nums.get(3));
		System.out.println("ũ�� : " + nums.size());

		// �� ����
		nums.clear();
		System.out.println("���� �� ũ�� : " + nums.size());

		// �迭�� �ε��� ���� ���ѵǾ��ִ�
//		int nums [] = new int[3];

//		nums[0] = 1;
//		nums[1] = 2;
//		nums[2] = 3;
//		nums[3] = 4; -> ArrayIndexOutOfBoundsException : Index 3 out of bounds for length 3

	}
}
