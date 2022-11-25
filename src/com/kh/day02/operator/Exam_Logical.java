package com.kh.day02.operator;

public class Exam_Logical {

	public static void main(String[] args) {
		/*논리연산자
		
		AND && 둘다 참이면 true
		OR || 하나 이상 참이면 true
		
		&& 연산 시 첫항이 F이면 다음항은 연산하지 않음 (결과 F)
		|| 연산 시 첫항이 T이면 다음항은 연산하지 않음 (결과 T)
		
		*/

		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4;
		
		result1 = (num1 != num2) && (num1 < num2);
		result2 = (num1 < num2) || (num1 == num2); 
		result3 = (num1 > num2) && (num1 != num2); 
		result4 = (num1 > num2) || (num1 == num2); 
		
		System.out.println("1의 결과는 " + result1);
		System.out.println("2의 결과는 " + result2);
		System.out.println("3의 결과는 " + result3);
		System.out.println("4의 결과는 " + result4);
		
		///////
		
		int aNum = 70;
		int bNum = 55;
		result1 = (aNum == bNum) || (aNum++ < 100);
		result2 = (aNum < bNum) && (--bNum < 55);
		result3 = (aNum != bNum) && (bNum-- < aNum++);
		result4 = (aNum++ != bNum) || (bNum++ >= 85);
		
		System.out.println("1의 결과값은 " + result1);
		System.out.println("2의 결과값은 " + result2);
		System.out.println("3의 결과값은 " + result3);
		System.out.println("4의 결과값은 " + result4);
		
		
	}

}
