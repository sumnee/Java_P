package com.kh.day14.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {

	public static void main(String[] args) {
		//예시 해보기
		
		/*		1. 정보입력
		 *		2. 정보출력
		 *		3. 정보저장(save)
		 *		4. 정보불러오기(load)
		 *		0. 종료
		 *		메뉴 입력 : 1		

		 *		이름 입력 : 일용자
		 *      나이 입력 : 33
		 *		주소 입력 : 서울시 종로구

		 *		1. 정보입력
		 *		2. 정보출력
		 *		3. 정보저장(save)
		 *		4. 정보불러오기(load)
		 *		0. 종료
		 *      메뉴 입력 : 2
		 *
		 * 		이름 : 일용자
		 * 		나이 : 33
		 * 		주소 : 서울시 종로구
			
		 * 		3. 선택하여 저장 후 파일을 열어보면
		 * 		단, 파일의 이름은 이름으로 한다.
		 * 		일용자.txt -> 일용자/33/서울시 종로구
		 * 		이용자.txt -> 이용자/22/서울시 중구
		 * 		삼용자.txt -> 삼용자/11/서울시 서대문구
		 * 
		 * 		4. 선택 후 파일의 제목을 입력하여 로드한 후에
		 * 		2. 선택하면 정보가 출력됨
		 * 
		 * 	
		 */
		
		Scanner sc = new Scanner(System.in);
		Writer writer = null;
		
		End : 
		while(true) {
			
		System.out.println("1. 정보 입력");
		System.out.println("2. 정보 출력");
		System.out.println("3. 정보 저장 (save)");
		System.out.println("4. 정보 불러오기 (load)");
		System.out.println("0. 종료");
		System.out.println("메뉴 입력 >>");
		int input = sc.nextInt();
		String name = "";
		int age = 0;
		String add = "";
		
			switch(input) {
			
			case 1 :
				System.out.print("이름 입력 : ");
				name = sc.next();
				System.out.print("나이 입력 : ");
				age = sc.nextInt();
				System.out.print("주소 입력 : ");
				add = sc.next();
				break;
				
			case 2 :
				System.out.println("이름 : " + name);
				System.out.println("나이 : " + age);
				System.out.println("주소 : " + add);
				break;
				
			case 3 :
				try {
					writer = new FileWriter("src/com/kh/day14/exercise/personalinfo.txt");
					String data = name + "/" + age + "/" + add;
					writer.write(data);
					writer.flush();
					System.out.println("저장 완료");
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
				System.out.println("종료합니다!");
				break End;
			
		
			
			
		}
			
		
		
		
		
		}

	}

}
