package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {

	public static void main(String[] args) {
		
		Socket socket = null;
		String address = "127.0.0.1"; 
		int port = 8507;
		OutputStream os= null;
		InputStream is = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("������ �������Դϴ�...");
			socket = new Socket(address, port);
			System.out.println("ä�ü����� �����Ͽ����ϴ�.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("�������� ä���� �����մϴ�.");
			
			while(true) {
				//�ޱ�
				String recvMsg = dis.readUTF();
				System.out.println("����(���) : " + recvMsg);
				
				//������
				System.out.print("Ŭ���̾�Ʈ(��) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
