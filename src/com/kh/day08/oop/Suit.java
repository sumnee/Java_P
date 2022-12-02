package com.kh.day08.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;

	public Suit(int size) { //1
		this(size, "Polo");
		System.out.println("Suit(int) 호출!");
	}
	public Suit(int size,String brand) { //2
		this(size, brand, 10000);
		System.out.println("Suit(int, String) 호출!");
	}		
	public Suit(int size, String brand, int price) { //3
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int,String,int) 호출" );
		
	}
}
//this()로 생성자 호출
//1 -> 2 -> 3 순서로 호출되어, 3번 프린트부터 실행됨
//9번줄 -> 13번줄 -> 17번줄 순서대로 this가 호출
