package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {

	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/filewriter.txt");
			char data[] = "�ȴ��氡��".toCharArray();		//���� �迭�� ���� ��������.
			for(int i=0;i<data.length;i++) {
			writer.write(data[i]);
			}
			writer.flush();		//���ۺ���(������ ���۰� ��� �Ƚᵵ ���������)
			System.out.println("���� �Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();	//��Ʈ�� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
