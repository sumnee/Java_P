package com.kh.day13.iostream;

import java.io.File;

public class Exercise_FileList {
	
	public static void listDirectory(File dir) {
		System.out.println("------" + dir.getPath() + "의 서브 리스트입니다.------");
		File subFiles[] = dir.listFiles(); 	//listFiles 메소드의 리턴형이 배열이라 맞춰서 변수 생성
		for(int i=0;i<subFiles.length;i++) {
			File fOne = subFiles[i];
			long time = fOne.lastModified();
			System.out.println(fOne.getName());
			System.out.print("\t파일크기 : " + fOne.length());
			System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n",time,time,time,time); //월 일 요일 시간
		}	
		
	}

	public static void main(String[] args) {
		
		File f1 = new File("c:\\windows");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		listDirectory(f1);
	}

}
