package com.kh.day13.iostream;

import java.io.File;

public class Exercise_FileList {
	
	public static void listDirectory(File dir) {
		System.out.println("------" + dir.getPath() + "�� ���� ����Ʈ�Դϴ�.------");
		File subFiles[] = dir.listFiles(); 	//listFiles �޼ҵ��� �������� �迭�̶� ���缭 ���� ����
		for(int i=0;i<subFiles.length;i++) {
			File fOne = subFiles[i];
			long time = fOne.lastModified();
			System.out.println(fOne.getName());
			System.out.print("\t����ũ�� : " + fOne.length());
			System.out.printf("\t������ �ð� : %tb %td %ta %tT\n",time,time,time,time); //�� �� ���� �ð�
		}	
		
	}

	public static void main(String[] args) {
		
		File f1 = new File("c:\\windows");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		listDirectory(f1);
	}

}
