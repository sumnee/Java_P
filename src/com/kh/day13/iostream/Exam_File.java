package com.kh.day13.iostream;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String [] args) {
		
		//���� ���� ���
		File file = new File("D:/TEMP/xmas.jpeg");
		String name = file.getName();
		String path 	= file.getPath();
		String parent	= file.getParent();
				
		System.out.println("���� �̸� : " + name);
		System.out.println("���� ��� : " + path);
		System.out.println("�θ� ���� : " + parent);		
		
		//���� ����
		File fileMake = new File("D:/TEMP/cake.txt");
		try {
			fileMake.createNewFile(); 		//�� �� �ۼ��ϰ� �ڵ� try-catch �����
			File fileMake2 = new File("D:/TEMP/cookie.txt");
			fileMake2.createNewFile();		//�Ź� ���ο� �޼ҵ� �����ؾ���
			
			//���� Ȯ��
			System.out.println("������ �����ϴ°�? : " + fileMake.exists());
			System.out.println("cake.txt�� ������ �´°�? : " + fileMake.isFile());
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//���� ����, Ȯ��
		File foldeMake = new File("D:/TEMP/Coffee");
		foldeMake.mkdir();
		System.out.println("Coffee�� ������ �´°�? : " + foldeMake.isDirectory());
	}
	

}
