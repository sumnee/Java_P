package com.kh.day10.exercise;

public class GoodCalc extends Calculator {

	public static void main(String[] args) {
		GoodCalc calc = new GoodCalc();
		System.out.println("�� : " + calc.add(1, 2));
		System.out.println("�� : " + calc.substract(3, 1));
		int arr[] = {10, 10, 10};
		System.out.println("��� : " + calc.average(arr));
	}

	public int add(int a, int b) {
		int result = a + b; //result ���� ���
		return result; // void�� �ƴ϶� ���� �ؾ��Ѵ�
	}

	public int substract(int a, int b) {
		return a - b; //���� ������� �ʰ� ����
	}

	public double average(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return (double)sum/a.length; 
		//double�� ���ڳ� �и� �տ� ���δ�
		//(double)(sum/a.length) �ϸ� ����� ������ ������ n.0 �Ǵ°Ŷ� �ǹ� ����
	}
}
