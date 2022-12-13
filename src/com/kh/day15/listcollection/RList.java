package com.kh.day15.listcollection;

public class RList<T> {		//<T> -> objectlist처럼 아무 형태나 넣을 수 있음
	
	private Object objects [];
	private int size;
	
	public RList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(T input) {
		objects[size] = input;
		size++;
	}
	
	public T get(int index) {
		return (T)objects[index];		
	}

	public int size() {
		return size;
	}

	public void clear() {
		objects = new Object [3];
		size = 0;
	}


}
