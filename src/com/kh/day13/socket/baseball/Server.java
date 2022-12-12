package com.kh.day13.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
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
		SimpleDateFormat trans = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		
		try {
			System.out.println("���������� �����Ͽ����ϴ�.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(1000);
			Date date = new Date();
			System.out.println(trans.format(date));
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
			while(true) {
				String readNum = dis.readUTF();
				System.out.println("�ޱ� : " + readNum);
				
				//���� ���� num���� ��
				//���� ��ġ �� ������ ��Ʈ����ũ, ���ڸ� ������ ��
				//��Ʈ����ũ�� 3�̸� ���� ����
				int strike = 0;
				int ball = 0;
				
				//�迭-�迭 �� 
				String readNums[] = readNum.split(" ");    //(" ")�� �������� �߶� �迭�� ������ش�
				for(int i=0;i<num.length;i++) {
					for(int e=0;e<readNums.length;e++) {
						if(num[i] == Integer.parseInt(readNums[e])) { //String �迭�� readNums�� ���ڷ� �ٲپ� ��
							//���� ������ �� �� ��ġ�� ������ ��
							if(i == e) {
								strike++;   //��ġ�� ������ ��ũ����ũ
							} else {
								ball++;		//���� ������ ��
							}	
						}
					}
			}	
				String result = strike + "��Ʈ����ũ " + ball + "��";
				System.out.println(result);		//�ܼ�â�� ���, Ŭ���̾�Ʈ���� ����� �ƴ�
				//Ŭ���̾�Ʈ���� ����� �����ֱ�
				dos.writeUTF(result);
				
				//��Ʈ����ũ�� 3�̸� ���� ����
				if(strike == 3) {
					System.out.println("�ƿ�! ���� ����");
					break;
				}
			}	
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
				is.close();
				os.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
