package com.kh.day09.casting;

public class castingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("민지");
//		p = new Person("");
		p = s; // 업캐스팅
		
		System.out.println(p.name);
		//업캐스팅, 부모클래스의 변수 사용 가능
		
		//System.out.println(p.grade);
		//System.out.println(p.department);
		//오류: grade cannot be resolved or is not a field
		//업캐스팅, 자식클래스의 변수 사용 불가능
		
		
		
		//다운캐스팅
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
	}
}
