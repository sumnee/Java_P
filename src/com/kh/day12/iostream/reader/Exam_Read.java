package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {

	public static void main(String[] args) {
		// ����Ʈ��� ��Ʈ��
		InputStream is =null;
		
		//���ڱ�� ��Ʈ��
		Reader reader = null;		//try �ۿ��� ����Ǿ�� finally���� ��� ����
		try {						//try-catch���� �ڵ� ����
			reader = new FileReader("src/filereader.txt");
			while(true) {						//�ݺ��� ������ �ѹ� ���Ƽ� ù���ڸ� ����
				int readData = reader.read(); 
				if(readData == -1) break;		//���� ���� ������ ���߱�
				System.out.print((char)readData);  //(char)�ִ� ���� : �׳� readData ����ϸ� int������ ��µ�
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 				//try-catch�� �ִ� ���, �ݵ�� ����Ǿ�� �ϴ� �ڵ� �ۼ�
			try {
				reader.close();		//��Ʈ�� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			} 	
		}
	}

}
