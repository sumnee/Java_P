package com.kh.day15.exercise;

public class IORun {

	public static void main(String[] args) {
		
		IOFunction io = new IOFunction();
		
		End : 
		while(true) {
			int input = io.printMenu();
			
			switch(input) {
			
			case 1 :
				io.insert();
				break;
				
			case 2 :
				io.print();
				break;
				
			case 3 :
				io.save();
				break;
				
			case 4 :
				io.load();
				break;
				
			case 0 :
				System.out.println("�����մϴ�!");
				break End;
				
			default :
				System.out.println("1~4 ������ �޴��� �����ϼ���.");	
			}
		}

	}

}
