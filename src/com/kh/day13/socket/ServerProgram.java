package com.kh.day13.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {
	public static void main(String [] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os = null;
		
		try {
			System.out.println("연결 대기중..");
			serverSocket = new ServerSocket(9196); 		//catch-try 자동작성
			Socket socket = serverSocket.accept();
			System.out.println("연결 수락됨!");
		
		
			/////Client에게 데이터 받기/////
			byte bytes[] = new byte[100];
			is = socket.getInputStream();
			int readByteNo = is.read(bytes);
			String message = new String(bytes,0,readByteNo);	
			System.out.println("데이터 받기 성공 : " + message);
			//////////////////////////////////////
			
			/////Clinet에게 데이터 보내기/////
			os = socket.getOutputStream();
			message = "Hello from Server";
			bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("데이터 전송 완료");
			///////////////////////////////////
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//server 실행 > client 실행
		
		//Address already in use: NET_Bind
		//이 오류 뜨면 콘솔에 실행중인 작업들 종료하고 다시하기
	}

}
