package com.kh.project.winebar;

public class Vine {
	private String name;
	private String number;
	private int member;
	private int day;
	private int time;
	
	public Vine() {}
	
	public Vine (String name, String number, int member, int day, int time) {
		this.name = name;
		this.number = number;
		this.member = member;
		this.day = day;
		this.time = time;
	}

	//getter
	public String getName() {
		return this.name;
	}
	public String getNumber() {
		return this.number;
	}
	public int getMember() {
		return this.member;
	}
	public int getDay() {
		return this.day;
	}
	public int getTime() {
		return this.time;
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setMember(int member) {
		this.member = member;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setTime(int time) {
		this.time = time;
	}

}
