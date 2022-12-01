package com.kh.day07.score;

import java.util.Scanner;

public class ScoreRun {
	public static void main(String[] args) {	
		ScoreFunction sFunc = new ScoreFunction(); //무한반복(While)에 넣지 말기
		Exit : 
		while(true) {
			int input = sFunc.printMenu();
			switch(input) {
			case 1 :
				sFunc.inputScore();
				break;
			case 2 :
				sFunc.printScore();
				break;
			case 3 :
				sFunc.goodBye();
				break Exit;
			default :
				sFunc.printException();
				break;
			}
		}
		
	}

}
