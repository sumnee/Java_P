package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/outputStream.txt");
			byte [] data = "Hello I/O".getBytes();
			for(int i=0;i<data.length;i++) { //for문으로 하나씩 넣기
				os.write(data[i]);
			}
			os.flush();		 //버퍼 비우기
			System.out.println("쓰기 완료!"); //실행되었는지 확인용
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
