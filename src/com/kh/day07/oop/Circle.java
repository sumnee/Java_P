package com.kh.day07.oop;

public class Circle {
	//�ʵ�
	public int radius; //������� ����(���� ������ public)
	public String name;
	
	
	//�޼ҵ�
	public Circle() { 
	//Ŭ������� �̸��� ���� �޼ҵ� => "������"
	//��ü ����, �ʵ� �ʱ�ȭ���ִ� ���� (���� ����=���� �� �ʱ�ȭ)
	//�����ڿ��� �ʱ�ȭ�� ��Ģ�̳�, ���� �� ���� �� �ʱ�ȭ�ϴ� ��
		
		this.radius = 1; //�ʱ�ȭ
		this.name = "��";
	}
	
	public double getArea() { //��ȯ��(return)�� �ִ� �޼ҵ� / ���ϰ��� �ڷ���(double) ǥ��
		
		//return 3.14*radius*radius; �ϱ� ����� ���� ���ľȾ����� ����
		
		double area = 3.14*radius*radius;
		return area;
	}

}
