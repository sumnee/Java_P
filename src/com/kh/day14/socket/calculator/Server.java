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
			System.out.println("���� ������");
			serverSocket = new ServerSocket(port);
			System.out.println("Ŭ���̾�Ʈ ���� �����...");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� ���� �Ϸ�");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			
			while(true) {
				String msg = dis.readUTF();
				if (msg.equals("bye")) { 		//������ bye���� Ȯ��
					System.out.println("Ŭ���̾�Ʈ�� ����");
					break;
				}
				System.out.println("���� �޼��� : " + msg);
				
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
					case "+" : result = num1 + num2 + ""; break; //""�־ ���ڿ��� �����
					case "-" : result = num1 - num2 + ""; break;
					case "*" : result = num1 * num2 + ""; break;
					case "/" : result = num1 / num2 + ""; break;
					case "%" : result = String.valueOf(num1 % num2) + ""; break; //�̷� ����� ����
					default : result = "�����ڸ� �߸��Է��ϼ̽��ϴ�." ;break;
				}
				
				dos.writeUTF(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
