package com.kh.day10.exercise;

public class GoodCalc extends Calculator {

	public static void main(String[] args) {
		GoodCalc calc = new GoodCalc();
		System.out.println("합 : " + calc.add(1, 2));
		System.out.println("차 : " + calc.substract(3, 1));
		int arr[] = {10, 10, 10};
		System.out.println("평균 : " + calc.average(arr));
	}

	public int add(int a, int b) {
		int result = a + b; //result 변수 사용
		return result; // void가 아니라서 리턴 해야한다
	}

	public int substract(int a, int b) {
		return a - b; //변수 사용하지 않고 리턴
	}

	public double average(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return (double)sum/a.length; 
		//double을 분자나 분모 앞에 붙인다
		//(double)(sum/a.length) 하면 결과가 정수로 나오고 n.0 되는거라 의미 없음
	}
}
