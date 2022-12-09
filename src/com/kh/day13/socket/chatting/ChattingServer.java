package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		OutputStream os= null;
		InputStream is = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		int port = 8507;
		Scanner sc = new Scanner(System.in);
			
		try {
			System.out.println("ä�ü����� �������Դϴ�...");
			Thread.sleep(2000);			//2�� ����
			serverSocket = new ServerSocket(port);
			System.out.println("ä�ü����� �����Ͽ����ϴ�.");
			Thread.sleep(2000);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�.");
			Thread.sleep(2000);
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("ä���� ���۵Ǿ����ϴ�.");
			
			while(true) {
				//������
				System.out.print("����(��) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				
				//�ޱ�
				String recvMsg = dis.readUTF();
				System.out.println("Ŭ���̾�Ʈ(���) : " + recvMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
