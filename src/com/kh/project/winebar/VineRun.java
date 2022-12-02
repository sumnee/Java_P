package com.kh.project.winebar;

public class VineRun {
	
	public static void main(String []args) {
		VineFunction vFunc = new VineFunction();
		
		Exit :
		while(true) {
			int input = vFunc.printMenu();
			switch(input) {
			case 1 :
				vFunc.reservation();
				break;
			case 2 :
				vFunc.check();
				break;
			case 3 :
				vFunc.bestMenu();
				break;
			case 4 :
				vFunc.goodBye();
				break Exit;
			default :
				vFunc.printException();
				break;
				
			}
		}
	}

}
