package com.kh.day14.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os =null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int port = 8989;

		try {
			System.out.println("서버 구동중");
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트 연결 대기중...");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결 완료");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			
			while(true) {
				String msg = dis.readUTF();
				if (msg.equals("bye")) { 		//받은게 bye인지 확인
					System.out.println("클라이언트가 종료");
					break;
				}
				System.out.println("받은 메세지 : " + msg);
				
				String msgArr[] = msg.split(" ");
				if(msgArr.length != 3 ) {
					msg = "end";
					dos.writeUTF(msg);
					continue;
				}
				int num1 = Integer.parseInt(msgArr[0]);
				String operator = msgArr[1];
				int num2 = Integer.parseInt(msgArr[2]);
				String result = "";
				
				switch(operator) {
					case "+" : result = num1 + num2 + ""; break; //""넣어서 문자열로 만들기
					case "-" : result = num1 - num2 + ""; break;
					case "*" : result = num1 * num2 + ""; break;
					case "/" : result = num1 / num2 + ""; break;
					case "%" : result = String.valueOf(num1 % num2) + ""; break; //이런 방법도 있음
					default : result = "연산자를 잘못입력하셨습니다." ;break;
				}
				
				dos.writeUTF(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
