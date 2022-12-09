package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Exam_ChattingClient {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os= null;
		InputStream is = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			System.out.println("연결 요청");
			socket = new Socket("127.0.0.1",8520);
			System.out.println("연결 성공!");
		
			//데이터 보내기
			os = socket.getOutputStream();
			dos = new DataOutputStream(os); //바이트배열 없이 스트링으로 보내기
			dos.writeUTF("Hello Server~");	
			System.out.println("데이터 전송 완료");
			
			//데이터 받기
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			String message = dis.readUTF();
			System.out.println("데이터 받기 성공 : " + message);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
