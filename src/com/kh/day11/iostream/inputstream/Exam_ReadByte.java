package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/inputStream.txt");		//업캐스팅
			byte [] readBytes = new byte[3];
			String data ="";
			int readByteNo;
			while((readByteNo = is.read(readBytes)) != -1) { 		//이렇게도 가능! 
				data += new String(readBytes, 0, readByteNo);		//배열의 데이터를 String으로 바꾸기
																	//그냥 출력하면 읽은 배열의 수를 리턴한다.
			}
			System.out.println(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}

}
