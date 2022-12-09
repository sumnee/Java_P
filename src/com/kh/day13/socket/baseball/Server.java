package com.kh.day13.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		int port = 8589;
		OutputStream os= null;
		InputStream is = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		int num[] = new int[3];
		
		try {
			System.out.println("���������� �����Ͽ����ϴ�.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(1000);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.");
			Socket socket = serverSocket.accept();
			Thread.sleep(1000);
			System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			Random rand = new Random();
			for(int i=0;i<num.length;i++) { //�ߺ������ؼ� �������� 3��
				num[i] = rand.nextInt(9)+1;
				for (int e = 0; e < i; e++) {
					if (num[i] == num[e]) {
						i--;
						break;
					}			
				}
			}
			System.out.println("���� ���� -> " + num[0] + " " + num[1] + " " + num[2]);
			System.out.println("���� �غ� �Ϸ�");
			
			String readNum = dis.readUTF();
			System.out.println("�ޱ� : " + readNum);
			
			//���� ���� num���� ��
			//���� ��ġ �� ������ ��Ʈ����ũ, ���ڸ� ������ ��
			//��Ʈ����ũ�� 3�̸� ���� ����
			int strike = 0;
			int ball = 0;
			System.out.println(strike + "��Ʈ����ũ " + ball + "��");
			//Ŭ���̾�Ʈ���� ����� �����ֱ�
			
			//��Ʈ����ũ�� 3�̸� ���� ����
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	

	}

}
