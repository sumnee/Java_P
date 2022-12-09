package com.kh.day13.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
	public static void main(String [] args) {
		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;
		
		try {
			System.out.println("연결 요청");
			socket = new Socket("127.0.0.1",9196);		//127.0.0.1 로컬호스트(나)
			System.out.println("연결 수락");
		
			/////Server에게 데이터 보내기/////
			byte buf[] = null;
			String message = "";
			os = socket.getOutputStream();
			message = "Hello from clent";
			buf = message.getBytes();	//write메소드 전달값 = 바이트배열
			os.write(buf);
			os.flush();
			System.out.println("데이터 전송 완료");
			///////////////////////////////////////
			
			/////Server에게 데이터 받기/////
			is = socket.getInputStream();
			buf = new byte[100];
			int readByteNo = is.read(buf);
			message = new String(buf,0,readByteNo);
			System.out.println("데이터 받기 성공 : " + message);
			////////////////////////////////
			
			
		} catch (UnknownHostException e) {				//catch-try 자동작성
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		
		
		
	}

}
