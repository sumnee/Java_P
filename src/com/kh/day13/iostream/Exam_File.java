package com.kh.day13.iostream;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String [] args) {
		
		//파일 정보 출력
		File file = new File("D:/TEMP/xmas.jpeg");
		String name = file.getName();
		String path 	= file.getPath();
		String parent	= file.getParent();
				
		System.out.println("파일 이름 : " + name);
		System.out.println("파일 경로 : " + path);
		System.out.println("부모 폴더 : " + parent);		
		
		//파일 생성
		File fileMake = new File("D:/TEMP/cake.txt");
		try {
			fileMake.createNewFile(); 		//이 줄 작성하고 자동 try-catch 만들기
			File fileMake2 = new File("D:/TEMP/cookie.txt");
			fileMake2.createNewFile();		//매번 새로운 메소드 생성해야함
			
			//파일 확인
			System.out.println("파일이 존재하는가? : " + fileMake.exists());
			System.out.println("cake.txt가 파일이 맞는가? : " + fileMake.isFile());
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//폴더 생성, 확인
		File foldeMake = new File("D:/TEMP/Coffee");
		foldeMake.mkdir();
		System.out.println("Coffee가 폴더가 맞는가? : " + foldeMake.isDirectory());
	}
	

}
