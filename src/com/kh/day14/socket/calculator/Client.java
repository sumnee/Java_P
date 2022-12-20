package com.kh.day14.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		
		String address = "127.0.0.1";
		int port = 8989;
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os =null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket(address, port);
			System.out.println("������ ���� �Ϸ�");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
				while(true) {
				System.out.print("����(��ĭ���� ��� �Է�, 24 + 42) >> ");
				String input = sc.nextLine();
				dos.writeUTF(input);
				
					if(input.equalsIgnoreCase("bye")) {			 //bye �ԷµȰ� Ȯ��
						System.out.println("�����Ͽ����ϴ�.");
						break;
					}
				String result = dis.readUTF();
					if(result.equals("end")) {
						System.out.println("���Ŀ� �°� �Է��ϼ���.");
						continue;
					}
				System.out.println("��� ��� : " + result);
				}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		

	}

}
