package com.kh.day10.musicinterface;

public class Musician {
	
	public void playInstrument(Instrument instrument) {
		 instrument.makeSound();
	}
	
	public void playInstrument(Piano piano) {
		piano.play();
	}
	public void playInstrument(Guitar guitar) { //�����ε�
		guitar.play();
	}
	public void playInstrument(Drum drum) {
		drum.play();
	}
 
}
