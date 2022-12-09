package com.kh.day13.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
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
		
		try {
			System.out.println("서버소켓을 생성하였습니다.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(1000);
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
			
			String readNum = dis.readUTF();
			System.out.println("받기 : " + readNum);
			
			//받은 값을 num값과 비교
			//숫자 위치 다 맞으면 스트라이크, 숫자만 맞으면 볼
			//스트라이크가 3이면 게임 종료
			int strike = 0;
			int ball = 0;
			System.out.println(strike + "스트라이크 " + ball + "볼");
			//클라이언트에게 결과값 보내주기
			
			//스트라이크가 3이면 게임 종료
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	

	}

}
