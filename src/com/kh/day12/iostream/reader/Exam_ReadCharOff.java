package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharOff {

	public static void main(String[] args) {
		Reader reader = null;
		
		try {		
			
			reader = new FileReader("src/filereader.txt");
			char cbuf[] = new char[2];
			reader.read(cbuf, 0, 2);
			for(int i=0;i<cbuf.length;i++) {
				System.out.println(cbuf[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
