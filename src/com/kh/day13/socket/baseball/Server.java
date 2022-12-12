package com.kh.day13.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Server {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		int port = 8589;
		OutputStream os= null;
		InputStream is = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		int num[] = new int[3];
		SimpleDateFormat trans = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		
		try {
			System.out.println("서버소켓을 생성하였습니다.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(1000);
			Date date = new Date();
			System.out.println(trans.format(date));
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			Thread.sleep(1000);
			System.out.println("클라이언트가 접속하였습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			Random rand = new Random();
			for(int i=0;i<num.length;i++) { //중복제거해서 랜덤숫자 3개
				num[i] = rand.nextInt(9)+1;
				for (int e = 0; e < i; e++) {
					if (num[i] == num[e]) {
						i--;
						break;
					}			
				}
			}
			System.out.println("서버 숫자 -> " + num[0] + " " + num[1] + " " + num[2]);
			System.out.println("서버 준비 완료");
			while(true) {
				String readNum = dis.readUTF();
				System.out.println("받기 : " + readNum);
				
				//받은 값을 num값과 비교
				//숫자 위치 다 맞으면 스트라이크, 숫자만 맞으면 볼
				//스트라이크가 3이면 게임 종료
				int strike = 0;
				int ball = 0;
				
				//배열-배열 비교 
				String readNums[] = readNum.split(" ");    //(" ")를 기준으로 잘라 배열로 만들어준다
				for(int i=0;i<num.length;i++) {
					for(int e=0;e<readNums.length;e++) {
						if(num[i] == Integer.parseInt(readNums[e])) { //String 배열인 readNums를 숫자로 바꾸어 비교
							//값이 같은지 비교 후 위치가 같은지 비교
							if(i == e) {
								strike++;   //위치도 같으면 스크라이크
							} else {
								ball++;		//값만 같으면 볼
							}	
						}
					}
			}	
				String result = strike + "스트라이크 " + ball + "볼";
				System.out.println(result);		//콘솔창에 출력, 클라이언트에게 출력은 아님
				//클라이언트에게 결과값 보내주기
				dos.writeUTF(result);
				
				//스트라이크가 3이면 게임 종료
				if(strike == 3) {
					System.out.println("아웃! 게임 종료");
					break;
				}
			}	
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
				is.close();
				os.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
