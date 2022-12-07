package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/inputStream.txt");   //이 줄만 치고 자동완성 사용해서 캐치트라이 만들기
			int readByte;
			while(true) { 				//아니면 for문으로 4번 돌려야지 ABCD 나옴 
			readByte = is.read();
			if(readByte == -1) break; 	//내용이 없으면 그만 읽어라
			System.out.println((char)readByte); //(char)안하면 아스키코드상 숫자로 나옴
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		//Unhandled exception type FileNotFoundException
		//반드시 try~catch 해줘야하는 예외
		
		
	}

}
