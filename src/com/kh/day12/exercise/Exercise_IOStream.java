package com.kh.day12.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {

	public void fileCopy() {
		// 이미지 파일 복사 --> 바이트 스트림
		// C:\\img\\xmas.jpeg -> D:\\xmas.jpeg

		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("C:\\img\\xmas.jpeg");
			os = new FileOutputStream("D:\\xmas.jpeg");
			byte readBytes[] = new byte[100];
			int readBytesNo;
			while ((readBytesNo = is.read(readBytes)) != -1) { // 여기까지 파일읽기
				os.write(readBytes, 0, readBytesNo); // 다 넣는게 아니라, 읽은 수 만큼만 넣는다
			}
			System.out.println("복사 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}


	public void memoMake() {
		/*
		 * 저장할 파일명 입력 : khtext.txt
		 * 'khtext.txt'' 파일에 저장될 내용 입력 :
		 * 종료는 exit
		 * 1 : 1111
		 * 2 : text input
		 * 3 : good
		 * 4 : gogogo
		 * 5 : exit
		 * 파일 저장 완료 (exit는 제외하고 저장)
		 * 
		 */
		Writer writer = null;
		Scanner sc= new Scanner(System.in);
		System.out.print("저장할 파일명 입력 : ");
		String name = sc.next();
		
		try {
			writer = new FileWriter("src/" + name + ".txt");
			
			System.out.println("'" + name + "'" + "파일에 저장될 내용 입력");
			System.out.println("종료는 exit 입력");
			sc.nextLine(); //엔터키 하나 먹어줘서 순서대로 출력되도록 
			int i = 1;
			while(true) {
				System.out.println(i + ". >> ");
				String input = sc.nextLine();
				if("exit".equals(input)) break;  //input=null일때 오류 방지를 위해 equals(input)한다
				writer.write(input + "\n");
				i++;
			}		
			System.out.println("입력 완료");
		} catch (IOException e) {
			e.printStackTrace();
			} finally {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}
}





