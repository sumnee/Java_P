package com.kh.day09.overloading;

class Weapon {
	
	public Weapon() {}
	public Weapon(int value) {			//오버로딩 - 메소드 (매개변수 수, 타입 다르게)
		System.out.println(value);
	}
	
	public Weapon(int value, String name) {
		System.out.println(value + " : " + name);
	}
	
	protected int fire() {				 //오버로딩 
		return 1;
	}

	protected int fire(int steampack) { 
		return steampack*100;
	}
	
	protected int fire(int steampack, int medicine) {
		return steampack+medicine;
	}
	
	protected int fire(String streampack) {
		System.out.println(streampack);
		return 1;
	}
}

class Cannon extends Weapon {
	protected int fire() { 				//2. 오버라이딩 - 메소드 같음
		return 10;
	}
}

public class MethodOverloadingEx {
	public static void main(String[] args) {	
		System.out.println(); 
		
	}

}
//overriding은 다른 클래스에 복붙, 완전 같은 메소드 
//overloading은 같은 클래스에 메소드의 매개변수 수나 타입 다르게 복붙  (ex)sysout
