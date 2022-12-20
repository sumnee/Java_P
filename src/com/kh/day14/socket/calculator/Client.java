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
			System.out.println("서버와 연결 완료");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
				while(true) {
				System.out.print("계산식(빈칸으로 띄어 입력, 24 + 42) >> ");
				String input = sc.nextLine();
				dos.writeUTF(input);
				
					if(input.equalsIgnoreCase("bye")) {			 //bye 입력된거 확인
						System.out.println("종료하였습니다.");
						break;
					}
				String result = dis.readUTF();
					if(result.equals("end")) {
						System.out.println("형식에 맞게 입력하세요.");
						continue;
					}
				System.out.println("계산 결과 : " + result);
				}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		

	}

}
