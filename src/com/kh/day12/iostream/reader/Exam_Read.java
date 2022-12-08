package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {

	public static void main(String[] args) {
		// 바이트기반 스트림
		InputStream is =null;
		
		//문자기반 스트림
		Reader reader = null;		//try 밖에서 선언되어야 finally에서 사용 가능
		try {						//try-catch구문 자동 삽입
			reader = new FileReader("src/filereader.txt");
			while(true) {						//반복문 없으면 한번 돌아서 첫글자만 읽음
				int readData = reader.read(); 
				if(readData == -1) break;		//읽을 것이 없으면 멈추기
				System.out.print((char)readData);  //(char)넣는 이유 : 그냥 readData 출력하면 int값으로 출력됨
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 				//try-catch에 있는 기능, 반드시 실행되어야 하는 코드 작성
			try {
				reader.close();		//스트림 닫기
			} catch (IOException e) {
				e.printStackTrace();
			} 	
		}
	}

}
