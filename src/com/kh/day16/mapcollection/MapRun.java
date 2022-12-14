package com.kh.day16.mapcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;import com.kh.day16.setcollection.Student;

public class MapRun {
	public static void main(String[] args) {
	Map<String, Student> std = new HashMap<String, Student>();
	std.put("1", new Student("김민지", 80));
	std.put("2", new Student("김지연", 90));
	
	System.out.println(std.get("1").toString());
	}
	
	
	
	public void mapExample1() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("02", "서울");
		map.put("031", "경기도");
		map.put("051", "부산");
		
		System.out.println(map.size());
		System.out.println(map.get("02"));//키값 "02"를 넣어준다
		
		Scanner sc= new Scanner(System.in);
		System.out.println("지연번호 입력 : ");
		String regionSode = sc.next();
		
		System.out.println("입력한 지역번호 : " + map.get(regionSode));
		
	}
	

	public void mapExample2() {
		
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("name", "아메리카노");
		objMap.put("가격", 1500);
		objMap.put("만족도", true);
		System.out.println(objMap.get("name"));
		System.out.println(objMap.get("가격"));
		String result = (boolean)objMap.get("만족도")? "추천" : "비추천";
		System.out.println(objMap.get(result));
		
	}




}
