package com.kh.day09.insof;

public class InstanceEx {
	static void print(Person p) {
		if(p instanceof Person) // ';' 없음
			System.out.println("Person 입니다."); 
		if(p instanceof Student)
			System.out.println("Student 입니다.");
		if(p instanceof Resercher)
			System.out.println("Resercher 입니다.");
		if(p instanceof Professor)
			System.out.println("Professor 입니다.");
	}
	public static void main (String[] args) {
		print(new Person());
		print (new Student());
		print (new Resercher());
		print (new Professor());
	
		}

	}


