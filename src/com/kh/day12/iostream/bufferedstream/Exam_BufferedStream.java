package com.kh.day12.iostream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {

	public static void main(String[] args) {
		/* ���� ũ�⸦ 5���ϰ� ǥ�� ��� ��Ʈ���� ������ ���� ��� ��Ʈ���� �����϶�
		 * C:\\Temp\\kh.txt ����� ���� �ؽ�Ʈ �о� ��� * 
		 */
		FileReader fir = null;
		int readChar;
		try {
			fir = new FileReader("C:\\Temp\\kh.txt");	//���� ���� (�̹� �ִ� ����)	
			
			BufferedOutputStream bout  	//�ܼ���¿�
			= new BufferedOutputStream(System.out, 5);
			
			while((readChar = fir.read()) != -1) {
				bout.write(readChar);	//�ֿܼ� write
			}
//			new Scanner(System.in).nextLine();  
//			5���� �дٰ� �ϳ� ������, ���� ġ�� flush�� �۵��ϸ� ���ۿ� ���� �ϳ��� ��µ�
			
			bout.close(); //��Ʈ�� �����鼭 �������� ����ϴϱ� close�� flush ��ü
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fir.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}			
	}

}
