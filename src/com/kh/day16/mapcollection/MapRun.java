package com.kh.day16.mapcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;import com.kh.day16.setcollection.Student;

public class MapRun {
	public static void main(String[] args) {
	Map<String, Student> std = new HashMap<String, Student>();
	std.put("1", new Student("�����", 80));
	std.put("2", new Student("������", 90));
	
	System.out.println(std.get("1").toString());
	}
	
	
	
	public void mapExample1() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("02", "����");
		map.put("031", "��⵵");
		map.put("051", "�λ�");
		
		System.out.println(map.size());
		System.out.println(map.get("02"));//Ű�� "02"�� �־��ش�
		
		Scanner sc= new Scanner(System.in);
		System.out.println("������ȣ �Է� : ");
		String regionSode = sc.next();
		
		System.out.println("�Է��� ������ȣ : " + map.get(regionSode));
		
	}
	

	public void mapExample2() {
		
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("name", "�Ƹ޸�ī��");
		objMap.put("����", 1500);
		objMap.put("������", true);
		System.out.println(objMap.get("name"));
		System.out.println(objMap.get("����"));
		String result = (boolean)objMap.get("������")? "��õ" : "����õ";
		System.out.println(objMap.get(result));
		
	}




}
