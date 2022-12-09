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
			System.out.println("���� ��ٸ�...");
			Socket socket = serversocket.accept(); //�� ���� ��ٸ�����
			System.out.println("���� ����!");
			
			//������ �ޱ�
			is = socket.getInputStream(); 
			dis = new DataInputStream(is); //����Ʈ�迭 ���� ��Ʈ������ �ޱ�
			String message = dis.readUTF();
			System.out.println("������ �ޱ� ���� : " + message);
		
			//������ ������
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			dos.writeUTF("Hello Client!");
			System.out.println("������ ���� �Ϸ�");
			
		} catch (IOException e) {		
			e.printStackTrace();
		}

	}

}
