package com.kh.day09.overloading;

class Weapon {
	
	public Weapon() {}
	public Weapon(int value) {			//�����ε� - �޼ҵ� (�Ű����� ��, Ÿ�� �ٸ���)
		System.out.println(value);
	}
	
	public Weapon(int value, String name) {
		System.out.println(value + " : " + name);
	}
	
	protected int fire() {				 //�����ε� 
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
	protected int fire() { 				//2. �������̵� - �޼ҵ� ����
		return 10;
	}
}

public class MethodOverloadingEx {
	public static void main(String[] args) {	
		System.out.println(); 
		
	}

}
//overriding�� �ٸ� Ŭ������ ����, ���� ���� �޼ҵ� 
//overloading�� ���� Ŭ������ �޼ҵ��� �Ű����� ���� Ÿ�� �ٸ��� ����  (ex)sysout
