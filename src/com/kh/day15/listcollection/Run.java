package com.kh.day15.listcollection;

import java.util.ArrayList;
import java.util.List;

import com.kh.day07.student.Student;

public class Run {
	public static void main(String[] args) {
		List<Integer> list = null; 			//java.util 에 있는 List 가져옴 
		
		list = new ArrayList<Integer>();
		list.add(11);
		list.add(5);
		list.add(100);
		list.add(8);
		
		int size = list.size();
		System.out.println(size);
		
		for(int i=0; i<list.size();i++) {
			System.out.println((i+1)+"번째 값 : " + list.get(i));
		}
		
		System.out.println("Foreach문 출력");
		for(Integer ione : list) {
			System.out.println(ione);
		}
		
		list.set(1,7); 		//1번째 인덱스 값을 7로 바꾼다
		
		System.out.println("다시 출력");
		for(Integer ione : list) {
			System.out.println(ione);
		}
		
	}
	
	public void genericExample() {
		RList<Integer> list = new RList<Integer>(); //자료형 지정
		list.add(1);
		list.add(20);
		list.add(55);
		
		int num = list.get(0);	//형변환 없음
		num = list.get(1);
		
		System.out.println(num);
	}
	
	
	public void objectExample() {		//object로 해서 다양한 자료형 넣기 가능
		ObjectList list = new ObjectList();
		list.add(11);
		list.add("월");
		list.add(new Student());
		
		int num = (int)list.get(0); 		//형변환 해줘야 사용 가능 - 다운캐스팅
		String word = (String)list.get(1);
		Student one = (Student)list.get(2);
	}
	
	
	public void intExample() {
		IntList list = new IntList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.size());
		
		list.clear();
		System.out.println(list.size());
	}

}
