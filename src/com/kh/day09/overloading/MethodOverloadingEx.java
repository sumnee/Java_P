package com.kh.day09.overloading;

class Weapon {
	protected int fire() {				 //1.
		return 1;
	}

	protected int fire(int steampack) { //3. �����ε� - �޼ҵ� (�Ű����� ��, Ÿ�� �ٸ���)
		return steampack*100;
	}
}
class Cannon extends Weapon {
	protected int fire() { 				//2. �������̵� - �޼ҵ� ����
		return 10;
	}
}

public class MethodOverloadingEx {
	public static void main(String[] args) {	
		System.out.println(); //?���� �ϴٸ��� �� ����... pdf ���� ȥ�� �ϱ�
		
	}

}
//�������̵��� �ٸ� Ŭ������ ����, ���� ���� �޼ҵ�
//�����ε��� ���� Ŭ������ �޼ҵ��� �Ű����� ���� Ÿ�� �ٸ��� ����
