package com.kh.day09.casting;

public class castingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("����");
//		p = new Person("");
		p = s; // ��ĳ����
		
		System.out.println(p.name);
		//��ĳ����, �θ�Ŭ������ ���� ��� ����
		
		//System.out.println(p.grade);
		//System.out.println(p.department);
		//����: grade cannot be resolved or is not a field
		//��ĳ����, �ڽ�Ŭ������ ���� ��� �Ұ���
		
		
		
		//�ٿ�ĳ����
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
	}
}
