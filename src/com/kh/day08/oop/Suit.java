package com.kh.day08.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;

	public Suit(int size) { //1
		this(size, "Polo");
		System.out.println("Suit(int) ȣ��!");
	}
	public Suit(int size,String brand) { //2
		this(size, brand, 10000);
		System.out.println("Suit(int, String) ȣ��!");
	}		
	public Suit(int size, String brand, int price) { //3
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int,String,int) ȣ��" );
		
	}
}
//this()�� ������ ȣ��
//1 -> 2 -> 3 ������ ȣ��Ǿ�, 3�� ����Ʈ���� �����
//9���� -> 13���� -> 17���� ������� this�� ȣ��
