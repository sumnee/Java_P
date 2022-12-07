package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/inputStream.txt");   //�� �ٸ� ġ�� �ڵ��ϼ� ����ؼ� ĳġƮ���� �����
			int readByte;
			while(true) { 				//�ƴϸ� for������ 4�� �������� ABCD ���� 
			readByte = is.read();
			if(readByte == -1) break; 	//������ ������ �׸� �о��
			System.out.println((char)readByte); //(char)���ϸ� �ƽ�Ű�ڵ�� ���ڷ� ����
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		//Unhandled exception type FileNotFoundException
		//�ݵ�� try~catch ������ϴ� ����
		
		
	}

}
