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
	void paint() {			//���ٵ� �޼ҵ忡 ������ �ٸ� => �������̵�
		super.paint();  //paint -> draw ��ȸ�ؼ� �������̵��� sub�� ����
		super.draw();   //draw -> draw �ٷ� ��� ���� super�� ����
	}

	void draw() {			//�������̵�, �������ε� �߻�
		System.out.println("Sub Object");
	}
}

public class Ex_Overriding {

	public static void main(String[] args) {
		SuperClass ex = new SubClass(); //��ĳ����
		ex.paint();

	}

}
