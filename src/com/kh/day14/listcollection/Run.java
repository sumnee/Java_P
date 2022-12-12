package com.kh.day14.listcollection;

import com.kh.day07.student.Student;

public class Run {

	public static void main(String[] args) {
		
		ObjectList objList = new ObjectList();
		objList.add(11);
		objList.add("월");
		
		int num = (int)objList.get(0); //Object형태를 다운캐스팅(형변환) 해줘야함
		String str = (String)objList.get(1);

	}

	public void intExample() {
		IntList nums = new IntList(); // 클래스 안에 메소드를 구현하여 크기 상관 없게

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);

		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
		System.out.println(nums.get(3));
		System.out.println("크기 : " + nums.size());

		// 값 삭제
		nums.clear();
		System.out.println("삭제 후 크기 : " + nums.size());

		// 배열은 인덱스 값에 제한되어있다
//		int nums [] = new int[3];

//		nums[0] = 1;
//		nums[1] = 2;
//		nums[2] = 3;
//		nums[3] = 4; -> ArrayIndexOutOfBoundsException : Index 3 out of bounds for length 3

	}
}
