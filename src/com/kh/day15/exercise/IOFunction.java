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
	
	private static String name;
	private static int age;
	private static String add;

	static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 정보 입력");
		System.out.println("2. 정보 출력");
		System.out.println("3. 정보 저장 (save)");
		System.out.println("4. 정보 불러오기 (load)");
		System.out.println("0. 종료");
		System.out.println("메뉴 입력 >>");
		int input = sc.nextInt();
		return input;	
	}
	
	static void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();					//아래 nextLine 대신 엔터를 먹어준다
		add = sc.nextLine();			//nextLine() ==> 엔터를 받을 수 있어서 주의, 
										//위에서 먹어주지 않으면 입력 안하고 넘어감
		
	}
	
	static void print() {
		System.out.println("------ 정보 출력 ------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + add);
		System.out.println("------ ---- ---- ------");
			
		}

	static void save() {
		Writer writer = null;
		try {
			writer = new FileWriter("src/com/kh/day14/exercise/" + name +".txt");
			String data = name + "/" + age + "/" + add;
			writer.write(data);
			writer.flush();
			System.out.println("~~~ 저장 완료 ~~~");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}	
	
	static void load() {
		Reader reader = null; 
		BufferedReader bfReader = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("정보를 가져올 이름을 입력 : ");
		String fileName = sc.next();
		String data = "";
		try {
			reader = new FileReader("src/com/kh/day14/exercise/" + fileName +".txt");
			bfReader = new BufferedReader(reader);	//주스트림(Reader)을 대체
			data = bfReader.readLine();		 	// 파일을 한줄씩 읽어온다
			
			//불러온 정보를 "/"를 기준으로 잘라 정보를 출력해야한다
			//2가지 방법  1.split()  2.StringTokenizer
			
			StringTokenizer st = new StringTokenizer(data, "/"); 	
			name = st.nextToken();						//순서대로 꺼낸다
			age = Integer.parseInt(st.nextToken());		//String을 int에다 넣기위해
			add = st.nextToken();
			System.out.println("~~~ 로드 완료 ~~~");
			System.out.println("2번을 눌러 정보를 출력하세요.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	
	
}
