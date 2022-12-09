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
			System.out.println("���� �����..");
			serverSocket = new ServerSocket(9196); 		//catch-try �ڵ��ۼ�
			Socket socket = serverSocket.accept();
			System.out.println("���� ������!");
		
		
			/////Client���� ������ �ޱ�/////
			byte bytes[] = new byte[100];
			is = socket.getInputStream();
			int readByteNo = is.read(bytes);
			String message = new String(bytes,0,readByteNo);	
			System.out.println("������ �ޱ� ���� : " + message);
			//////////////////////////////////////
			
			/////Clinet���� ������ ������/////
			os = socket.getOutputStream();
			message = "Hello from Server";
			bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("������ ���� �Ϸ�");
			///////////////////////////////////
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//server ���� > client ����
		
		//Address already in use: NET_Bind
		//�� ���� �߸� �ֿܼ� �������� �۾��� �����ϰ� �ٽ��ϱ�
	}

}
