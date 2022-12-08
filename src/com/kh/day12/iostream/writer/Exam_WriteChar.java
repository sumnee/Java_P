package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {

	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/filewriter.txt"); //���� �迭�� �ֱ�
			char cbuf[] = "�Ƹ޸�ī��".toCharArray();
			writer.write(cbuf);
			writer.flush();
			System.out.println("���� �Ϸ�");
		} catch (IOException e) {
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
