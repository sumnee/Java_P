package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriterStr {
	public static void main(String [] args) {
		
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/filewriter.txt"); //String 바로 넣기
			String data = "초밥";
			writer.write(data);
			writer.flush();
			System.out.println("쓰기 확인");
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
