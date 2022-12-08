package com.kh.day12.iostream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {

	public static void main(String[] args) {
		/* 버퍼 크기를 5로하고 표준 출력 스트림과 연결한 버퍼 출력 스트림을 생성하라
		 * C:\\Temp\\kh.txt 저장된 영문 텍스트 읽어 출력 * 
		 */
		FileReader fir = null;
		int readChar;
		try {
			fir = new FileReader("C:\\Temp\\kh.txt");	//파일 읽음 (이미 있는 파일)	
			
			BufferedOutputStream bout  	//콘솔출력용
			= new BufferedOutputStream(System.out, 5);
			
			while((readChar = fir.read()) != -1) {
				bout.write(readChar);	//콘솔에 write
			}
//			new Scanner(System.in).nextLine();  
//			5개씩 읽다가 하나 남았음, 엔터 치면 flush가 작동하며 버퍼에 남은 하나가 출력됨
			
			bout.close(); //스트림 닫으면서 남은것을 출력하니까 close로 flush 대체
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fir.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}			
	}

}
