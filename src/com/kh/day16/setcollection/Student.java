package com.kh.day16.setcollection;

public class Student {
	private String name;
	private int score;
	
	//��Ŭ-�ҽ�-���ʷ���Ʈ�� �������! gettersetter / constructor 2�� / toString
	
	public Student() {
		super();
	}
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public int hashCode() {					//������ �ؽ��ڵ� �������� (�ؽ��ڵ�=������ ��)
		return (this.name+this.score).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {		
		if(obj instanceof Student) {		//�����ϴ� ���� ���� ���� ���� ������ (�ؽ��ڵ�� ��)
			Student std = (Student)obj;		//�߰����� ���� (������ ����ϸ� ����)
			return this.hashCode() == std.hashCode();
		} else {
			return false;
		}
	}
	
	
}
