package com.kh.day09.insof;

public class InstanceEx {
	static void print(Person p) {
		if(p instanceof Person) // ';' ����
			System.out.println("Person �Դϴ�."); 
		if(p instanceof Student)
			System.out.println("Student �Դϴ�.");
		if(p instanceof Resercher)
			System.out.println("Resercher �Դϴ�.");
		if(p instanceof Professor)
			System.out.println("Professor �Դϴ�.");
	}
	public static void main (String[] args) {
		print(new Person());
		print (new Student());
		print (new Resercher());
		print (new Professor());
	
		}

	}


