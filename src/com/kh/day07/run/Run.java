package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.exercise.Exercise_Lotto;
import com.kh.day07.oop.Person;
import com.kh.day07.oop.Rectangle;

public class Run {

	public static void main(String[] args) {
	
//		Exercise_Lotto exLotto = new Exercise_Lotto();
//		exLotto.lottoProgram();
//		
//		Person person = new Person();
//		person.eat();
//		person.sleep();
//		person.speak();
//		person.walk();		
		//person.name="��ö��"; - Person class ���� public �����߱ⶫ�� ����
		
		Scanner sc = new Scanner(System.in); //��ü����, "new" �̿�(��ü�� ������ ȣ��)
		
		//���۷��� ���� ����
		//���� ���� ����
		//�ּҰ� ����Ǵ� ����
		
		Rectangle rect = new Rectangle(); 
		
		System.out.print("�ʺ� �Է� : "); 
		//��ü�� ��� ���� "." �̿� (����� ������ �޼ҵ尡 ����)
		//�ν��Ͻ�(Rectangle Ŭ������ ��ü)
		rect.width = sc.nextInt(); //������� ����
		System.out.print("���� �Է� : ");
		rect.height = sc.nextInt(); //������� ����
		int result = rect.getArea(); //����޼ҵ� ����
		System.out.print("�簢�� ���� : " + result);
	}

}
