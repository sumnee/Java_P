package com.kh.day14.listcollection;

public class ObjectList {		
	//int, String 등 다양한 자료형을 배열에 사용하기 위해 조상형인 오브젝트 사용
	private Object[] objects;
	private int size;
	
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(Object input) {
		objects[size] = input;
		size++;
	}

	public Object get(int index) {
		return objects[index];
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}
