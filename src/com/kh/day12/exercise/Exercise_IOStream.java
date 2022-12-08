package com.kh.day12.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {

	public void fileCopy() {
		// �̹��� ���� ���� --> ����Ʈ ��Ʈ��
		// C:\\img\\xmas.jpeg -> D:\\xmas.jpeg

		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("C:\\img\\xmas.jpeg");
			os = new FileOutputStream("D:\\xmas.jpeg");
			byte readBytes[] = new byte[100];
			int readBytesNo;
			while ((readBytesNo = is.read(readBytes)) != -1) { // ������� �����б�
				os.write(readBytes, 0, readBytesNo); // �� �ִ°� �ƴ϶�, ���� �� ��ŭ�� �ִ´�
			}
			System.out.println("���� �Ϸ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}


	public void memoMake() {
		/*
		 * ������ ���ϸ� �Է� : khtext.txt
		 * 'khtext.txt'' ���Ͽ� ����� ���� �Է� :
		 * ����� exit
		 * 1 : 1111
		 * 2 : text input
		 * 3 : good
		 * 4 : gogogo
		 * 5 : exit
		 * ���� ���� �Ϸ� (exit�� �����ϰ� ����)
		 * 
		 */
		Writer writer = null;
		Scanner sc= new Scanner(System.in);
		System.out.print("������ ���ϸ� �Է� : ");
		String name = sc.next();
		
		try {
			writer = new FileWriter("src/" + name + ".txt");
			
			System.out.println("'" + name + "'" + "���Ͽ� ����� ���� �Է�");
			System.out.println("����� exit �Է�");
			sc.nextLine(); //����Ű �ϳ� �Ծ��༭ ������� ��µǵ��� 
			int i = 1;
			while(true) {
				System.out.println(i + ". >> ");
				String input = sc.nextLine();
				if("exit".equals(input)) break;  //input=null�϶� ���� ������ ���� equals(input)�Ѵ�
				writer.write(input + "\n");
				i++;
			}		
			System.out.println("�Է� �Ϸ�");
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





