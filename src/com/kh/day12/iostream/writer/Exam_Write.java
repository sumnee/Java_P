package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {

	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/filewriter.txt");
			char data[] = "안뇽방가룽".toCharArray();		//문자 배열로 만들어서 내보낸다.
			for(int i=0;i<data.length;i++) {
			writer.write(data[i]);
			}
			writer.flush();		//버퍼비우기(지금은 버퍼가 없어서 안써도 상관없긴함)
			System.out.println("쓰기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();	//스트림 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
