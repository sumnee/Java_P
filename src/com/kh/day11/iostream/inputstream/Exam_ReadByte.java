package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/inputStream.txt");		//��ĳ����
			byte [] readBytes = new byte[3];
			String data ="";
			int readByteNo;
			while((readByteNo = is.read(readBytes)) != -1) { 		//�̷��Ե� ����! 
				data += new String(readBytes, 0, readByteNo);		//�迭�� �����͸� String���� �ٲٱ�
																	//�׳� ����ϸ� ���� �迭�� ���� �����Ѵ�.
			}
			System.out.println(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}

}
