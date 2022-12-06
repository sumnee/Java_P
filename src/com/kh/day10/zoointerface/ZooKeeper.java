package com.kh.day10.zoointerface;

public class ZooKeeper {
	
	public void feed() {
		System.out.println("feed meat");
	}
	
	public void feed(Predator predator) {
		System.out.println(predator.animalFood());
	}
	
//	public void feed(Tiger tiger) {
//		System.out.println("feed tiger");
//	}
//	
//	public void feed(Lion lion) {
//		System.out.println("feed lion");
//	}
//	
//	public void feed(Bear bear) {
//		System.out.println("feed bear");
//	}

}
