package com.kh.day09.overriding;

class SuperClass {
	void paint() {
		draw();
	}

	void draw() {
		System.out.println("Super Object");
	}
}

class SubClass extends SuperClass {
	void paint() {			//복붙된 메소드에 내용이 다름 => 오버라이딩
		super.paint();  //paint -> draw 우회해서 오버라이딩된 sub로 간다
		super.draw();   //draw -> draw 바로 찍어 가서 super로 간다
	}

	void draw() {			//오버라이딩, 동적바인딩 발생
		System.out.println("Sub Object");
	}
}

public class Ex_Overriding {

	public static void main(String[] args) {
		SuperClass ex = new SubClass(); //업캐스팅
		ex.paint();

	}

}
