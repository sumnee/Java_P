package com.kh.day16.setcollection;

public class Student {
	private String name;
	private int score;
	
	//우클-소스-제너레이트로 만들었음! gettersetter / constructor 2종 / toString
	
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
	public int hashCode() {					//같은값 해시코드 같게해줌 (해시코드=고유의 값)
		return (this.name+this.score).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {		
		if(obj instanceof Student) {		//존재하는 값과 새로 들어온 값이 같으면 (해시코드로 비교)
			Student std = (Student)obj;		//추가할지 결정 (사이즈 출력하면 보임)
			return this.hashCode() == std.hashCode();
		} else {
			return false;
		}
	}
	
	
}
