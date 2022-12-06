package com.kh.day10.exercise;

abstract public class Calculator {
	abstract public int add(int a, int b);
	abstract public int substract(int a,int b);
	abstract public double average(int a[]);
}
//추상 클래스인 Calculator, GoodCalc에서 오버라이딩하여 계산기 만들기