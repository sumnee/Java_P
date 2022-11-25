package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		String name = sc.next();
		
		System.out.println("태어난 월을 입력해주세요.");
		int month = sc.nextInt();
		
		System.out.println("키를 입력해주세요");
		double tall = sc.nextDouble();
		
		System.out.println("성별을 입력해주세요.");
		char boy = sc.next().charAt(0);
		
		System.out.println("주소를 입력해주세요.");
		sc.nextLine(); // 엔터제거용, 넥스트라인이 윗줄의 엔터를 먹어서 바로 넘어감을 방지
		String address = sc.nextLine();
		
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("태어난 월은 " + month + "입니다.");
		System.out.println("키는 " + tall + "입니다.");
		System.out.println("성별은 " + boy + "입니다.");
		System.out.println("주소는 " + address + "입니다.");
		
		
	}

}
