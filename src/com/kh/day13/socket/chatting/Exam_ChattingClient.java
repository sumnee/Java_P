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
			System.out.println("���� ��û");
			socket = new Socket("127.0.0.1",8520);
			System.out.println("���� ����!");
		
			//������ ������
			os = socket.getOutputStream();
			dos = new DataOutputStream(os); //����Ʈ�迭 ���� ��Ʈ������ ������
			dos.writeUTF("Hello Server~");	
			System.out.println("������ ���� �Ϸ�");
			
			//������ �ޱ�
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			String message = dis.readUTF();
			System.out.println("������ �ޱ� ���� : " + message);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
