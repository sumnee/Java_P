package com.kh.day09.overloading;

class Weapon {
	protected int fire() {				 //1.
		return 1;
	}

	protected int fire(int steampack) { //3. 오버로딩 - 메소드 (매개변수 수, 타입 다르게)
		return steampack*100;
	}
}
class Cannon extends Weapon {
	protected int fire() { 				//2. 오버라이딩 - 메소드 같음
		return 10;
	}
}

public class MethodOverloadingEx {
	public static void main(String[] args) {	
		System.out.println(); //?뭔가 하다만듯 이 예제... pdf 보고 혼자 하기
		
	}

}
//오버라이딩은 다른 클래스에 복붙, 완전 같은 메소드
//오버로딩은 같은 클래스에 메소드의 매개변수 수나 타입 다르게 복붙
