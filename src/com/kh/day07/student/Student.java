package com.kh.day07.student;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student() {}
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//setter 메소드
	//멤버변수 각각 초기화
	public void setName(String name) { //값을 매개변수로 입력 받아서 선언한 변수에 입력
		this.name = name;
	} 
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	//getter메소드
	//멤버변수 값 리턴
	public String getName() {
		return this.name;
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
}
