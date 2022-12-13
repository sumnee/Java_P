package com.kh.day15.listcollection;

import java.util.ArrayList;
import java.util.List;

import com.kh.day07.student.Student;

public class Run {
	public static void main(String[] args) {
		List<Integer> list = null; 			//java.util �� �ִ� List ������ 
		
		list = new ArrayList<Integer>();
		list.add(11);
		list.add(5);
		list.add(100);
		list.add(8);
		
		int size = list.size();
		System.out.println(size);
		
		for(int i=0; i<list.size();i++) {
			System.out.println((i+1)+"��° �� : " + list.get(i));
		}
		
		System.out.println("Foreach�� ���");
		for(Integer ione : list) {
			System.out.println(ione);
		}
		
		list.set(1,7); 		//1��° �ε��� ���� 7�� �ٲ۴�
		
		System.out.println("�ٽ� ���");
		for(Integer ione : list) {
			System.out.println(ione);
		}
		
	}
	
	public void genericExample() {
		RList<Integer> list = new RList<Integer>(); //�ڷ��� ����
		list.add(1);
		list.add(20);
		list.add(55);
		
		int num = list.get(0);	//����ȯ ����
		num = list.get(1);
		
		System.out.println(num);
	}
	
	
	public void objectExample() {		//object�� �ؼ� �پ��� �ڷ��� �ֱ� ����
		ObjectList list = new ObjectList();
		list.add(11);
		list.add("��");
		list.add(new Student());
		
		int num = (int)list.get(0); 		//����ȯ ����� ��� ���� - �ٿ�ĳ����
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
