package com.kh.day14.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {

	public static void main(String[] args) {
		//���� �غ���
		
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
		
		Scanner sc = new Scanner(System.in);
		Writer writer = null;
		
		End : 
		while(true) {
			
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� ���� (save)");
		System.out.println("4. ���� �ҷ����� (load)");
		System.out.println("0. ����");
		System.out.println("�޴� �Է� >>");
		int input = sc.nextInt();
		String name = "";
		int age = 0;
		String add = "";
		
			switch(input) {
			
			case 1 :
				System.out.print("�̸� �Է� : ");
				name = sc.next();
				System.out.print("���� �Է� : ");
				age = sc.nextInt();
				System.out.print("�ּ� �Է� : ");
				add = sc.next();
				break;
				
			case 2 :
				System.out.println("�̸� : " + name);
				System.out.println("���� : " + age);
				System.out.println("�ּ� : " + add);
				break;
				
			case 3 :
				try {
					writer = new FileWriter("src/com/kh/day14/exercise/personalinfo.txt");
					String data = name + "/" + age + "/" + add;
					writer.write(data);
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
				break;
				
			case 4 :
				
				break;
				
			case 0 :
				System.out.println("�����մϴ�!");
				break End;
			
		
			
			
		}
			
		
		
		
		
		}

	}

}
