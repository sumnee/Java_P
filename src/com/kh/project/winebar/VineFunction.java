package com.kh.project.winebar;

import java.util.Random;
import java.util.Scanner;

public class VineFunction {
	Vine viner;
	
	public VineFunction() {
		viner = new Vine();
	}

	
	public int printMenu() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("~~~@~~~< VineWine 예약 프로그램 >~~~@~~~");
		System.out.println("1. 예약 요청 작성");
		System.out.println("2. 예약 요청 확인");
		System.out.println("3. 대표메뉴 안내");
		System.out.println("4. 프로그램 종료");
		System.out.print("번호 선택 : ");
		int input = sc.nextInt();
		return input;
	}
	
	public void reservation() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("~~~< 예약자 정보 입력 >~~~");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("연락처 : ");
		String number = sc.next();
		System.out.print("인원 (숫자만 입력) : ");
		int member = sc.nextInt();
		System.out.println("날짜 (yyyymmdd 형식으로 입력) : ");
		int day = sc.nextInt();
		System.out.println("이용 시간은 1부 17~19시 / 2부 19시~21시 중 선택 가능합니다.");
		System.out.print("원하는 시간대 (1or2 숫자만 입력) : ");
		int time = sc.nextInt();
		System.out.println();
		System.out.println("VineWine에 예약해주셔서 감사합니다.");
		System.out.println();
		System.out.println();
		
		viner = new Vine (name, number, member, day, time);	
	}
	public void check() {
		Random ran = new Random();
		int com = ran.nextInt(2);
		System.out.println();
		System.out.println("~~~< 예약 정보 확인 >~~~");
		System.out.println(viner.getName() + "님의 예약 내역입니다.");
		if(com == 1) {
			System.out.println("상태 : 예약 확정");
		} else {
			System.out.println("상태 : 가게에서 예약 가능 여부를 확인 중입니다.");
		}
		System.out.println("연락처 : " + viner.getNumber());
		System.out.println("예약 인원 : " + viner.getMember() + "명");
		System.out.println("예약 일시 : " + viner.getDay() + " / " + viner.getTime() + "부");
	}

	public void bestMenu() {
		System.out.println();
		System.out.println("~~~< 이달의 추천 메뉴 >~~~");
		System.out.println("* 식사류 > 버섯 크림 리조또: 16,000원");
		System.out.println("* 안주류 > 꿀을 얹은 리코타치즈와 바게트: 7,000원");
		System.out.println("* 이달의 와인 > 마가렛 크레망 드 리무 브릿: 55,000원");
		System.out.println("                청사과, 복숭아 과실향이 느껴지는 산뜻한 스파클링 와인입니다.");
	}
	
	public void goodBye() {
		System.out.println();
		System.out.println("VineWine을 이용해주셔서 감사합니다 ^^*");
	}
	
	public void printException() {
		System.out.println();
		System.out.println("1~4번 중에 선택해주세요.");		
	}
}
