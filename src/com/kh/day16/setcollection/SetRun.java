package com.kh.day16.setcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRun {
	public static void main(String[] args) {
		//Collection�� List,Set,Map �� ������ ������� ������ �Ѵ�
		//�ӽ� �Ǵ� ���������� ������ / �ڷᱸ���� Ư���� ���� ���� �ϳ��� ����
		
		Set<String> set = new HashSet<String>();		//���ڿ�
		set.add("one");
		set.add("two");
		set.add("three");
		
		System.out.println(set.size()); //����� �������� ��
		
		Iterator<String> iterator = set.iterator(); 	//set�� �����͸� ������ �� �ִ� �޼ҵ�
		while(iterator.hasNext()) {						//������ ������ ���
			System.out.println(iterator.next());
		}
		System.out.println("==================");
	
		set.add("one");		//Set�� �ߺ��� ������� ����
		Iterator<String> iterator2 = set.iterator(); 	
		while(iterator2.hasNext()) {					
			System.out.println(iterator2.next());
		}
		
		Set<Integer> set2 = new HashSet<Integer>(); 	//����
		set2.add(11);
		
		Set<Student> set3 = new HashSet<Student>(); 	//��ü
		set3.add(new Student("����", 60));
		set3.add(new Student("����", 80));
		System.out.println(set3.size());
		set3.add(new Student("����", 80));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		System.out.println(set3.size());
		
		System.out.println();
		System.out.println(new Student("����", 80).hashCode());	//�������̵�, �ؽ��ڵ� ����ϸ� ���� ����
		System.out.println(new Student("����", 80).hashCode());
		
	}
	
	/////�� ��Ű���� ������ ����� ���� Ȯ���ϱ�

}
