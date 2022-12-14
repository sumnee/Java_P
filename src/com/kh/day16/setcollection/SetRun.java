package com.kh.day16.setcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRun {
	public static void main(String[] args) {
		//Collection의 List,Set,Map 은 데이터 저장소의 역할을 한다
		//임시 또는 영구적으로 저장함 / 자료구조의 특성에 따라 셋중 하나를 쓴다
		
		Set<String> set = new HashSet<String>();		//문자열
		set.add("one");
		set.add("two");
		set.add("three");
		
		System.out.println(set.size()); //저장된 데이터의 수
		
		Iterator<String> iterator = set.iterator(); 	//set의 데이터를 꺼내올 수 있는 메소드
		while(iterator.hasNext()) {						//다음이 있으면 출력
			System.out.println(iterator.next());
		}
		System.out.println("==================");
	
		set.add("one");		//Set은 중복을 허용하지 않음
		Iterator<String> iterator2 = set.iterator(); 	
		while(iterator2.hasNext()) {					
			System.out.println(iterator2.next());
		}
		
		Set<Integer> set2 = new HashSet<Integer>(); 	//정수
		set2.add(11);
		
		Set<Student> set3 = new HashSet<Student>(); 	//객체
		set3.add(new Student("민지", 60));
		set3.add(new Student("지은", 80));
		System.out.println(set3.size());
		set3.add(new Student("지은", 80));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		System.out.println(set3.size());
		
		System.out.println();
		System.out.println(new Student("지은", 80).hashCode());	//오버라이딩, 해시코드 출력하면 같게 나옴
		System.out.println(new Student("지은", 80).hashCode());
		
	}
	
	/////이 패키지는 선생님 깃허브 보고 확인하기

}
