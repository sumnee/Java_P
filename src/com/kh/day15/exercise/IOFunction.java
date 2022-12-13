package com.kh.day15.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class IOFunction {
	
	/*		1. �����Է�
	 *		2. �������
	 *		3. ��������(save)
	 *		4. �����ҷ�����(load)
	 *		0. ����
	 *		�޴� �Է� : 1		

	 *		�̸� �Է� : �Ͽ���
	 *      ���� �Է� : 33
	 *		�ּ� �Է� : ����� ���α�

	 *		1. �����Է�
	 *		2. �������
	 *		3. ��������(save)
	 *		4. �����ҷ�����(load)
	 *		0. ����
	 *      �޴� �Է� : 2
	 *
	 * 		�̸� : �Ͽ���
	 * 		���� : 33
	 * 		�ּ� : ����� ���α�
		
	 * 		3. �����Ͽ� ���� �� ������ �����
	 * 		��, ������ �̸��� �̸����� �Ѵ�.
	 * 		�Ͽ���.txt -> �Ͽ���/33/����� ���α�
	 * 		�̿���.txt -> �̿���/22/����� �߱�
	 * 		�����.txt -> �����/11/����� ���빮��
	 * 
	 * 		4. ���� �� ������ ������ �Է��Ͽ� �ε��� �Ŀ�
	 * 		2. �����ϸ� ������ ��µ�
	 * 
	 * 	
	 */
	
	private static String name;
	private static int age;
	private static String add;

	static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� ���� (save)");
		System.out.println("4. ���� �ҷ����� (load)");
		System.out.println("0. ����");
		System.out.println("�޴� �Է� >>");
		int input = sc.nextInt();
		return input;	
	}
	
	static void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		System.out.print("�ּ� �Է� : ");
		sc.nextLine();					//�Ʒ� nextLine ��� ���͸� �Ծ��ش�
		add = sc.nextLine();			//nextLine() ==> ���͸� ���� �� �־ ����, 
										//������ �Ծ����� ������ �Է� ���ϰ� �Ѿ
		
	}
	
	static void print() {
		System.out.println("------ ���� ��� ------");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + add);
		System.out.println("------ ---- ---- ------");
			
		}

	static void save() {
		Writer writer = null;
		try {
			writer = new FileWriter("src/com/kh/day14/exercise/" + name +".txt");
			String data = name + "/" + age + "/" + add;
			writer.write(data);
			writer.flush();
			System.out.println("~~~ ���� �Ϸ� ~~~");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}	
	
	static void load() {
		Reader reader = null; 
		BufferedReader bfReader = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �̸��� �Է� : ");
		String fileName = sc.next();
		String data = "";
		try {
			reader = new FileReader("src/com/kh/day14/exercise/" + fileName +".txt");
			bfReader = new BufferedReader(reader);	//�ֽ�Ʈ��(Reader)�� ��ü
			data = bfReader.readLine();		 	// ������ ���پ� �о�´�
			
			//�ҷ��� ������ "/"�� �������� �߶� ������ ����ؾ��Ѵ�
			//2���� ���  1.split()  2.StringTokenizer
			
			StringTokenizer st = new StringTokenizer(data, "/"); 	
			name = st.nextToken();						//������� ������
			age = Integer.parseInt(st.nextToken());		//String�� int���� �ֱ�����
			add = st.nextToken();
			System.out.println("~~~ �ε� �Ϸ� ~~~");
			System.out.println("2���� ���� ������ ����ϼ���.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	
	
}
