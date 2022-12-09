package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam_ChattingServer {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os= null;
		DataOutputStream dos = null;
		
		try {
			serversocket = new ServerSocket(8520);
			System.out.println("연결 기다림...");
			Socket socket = serversocket.accept(); //찐 연결 기다리는중
			System.out.println("연결 수락!");
			
			//데이터 받기
			is = socket.getInputStream(); 
			dis = new DataInputStream(is); //바이트배열 없이 스트링으로 받기
			String message = dis.readUTF();
			System.out.println("데이터 받기 성공 : " + message);
		
			//데이터 보내기
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			dos.writeUTF("Hello Client!");
			System.out.println("데이터 전송 완료");
			
		} catch (IOException e) {		
			e.printStackTrace();
		}

	}

}
