package com.kh.day11.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		Exam_Calendar ec = new Exam_Calendar();
		
		//��½ð�
		Calendar today = Calendar.getInstance(); 
		ec.printCalendar("����", today);
		System.out.println();
		
		//Ư�� �ð�
		//������
		Calendar some = Calendar.getInstance();
		some.clear();
		some.set(2022, 10, 23); //�� 0���� �����ϴ°� ���
		some.set(Calendar.HOUR_OF_DAY, 9);
		some.set(Calendar.MINUTE, 0);
		ec.printCalendar("������", some);
		System.out.println();
		
		
		//������
		Calendar end = Calendar.getInstance();
		end.clear();
		end.set(2023, 4, 2);
		end.set(Calendar.HOUR_OF_DAY, 17);
		end.set(Calendar.MINUTE, 50);
		ec.printCalendar("������", end);
	}

	public void printCalendar(String msg, Calendar cal) {	 //Ư�� �ð��� ����ϱ� ����

		//Calendar cal = Calendar.getInstance(); // Calendar�� �߻�Ŭ������ new ����
		
		int year 	  = cal.get(Calendar.YEAR);
		int month 	  = cal.get(Calendar.MONTH) + 1; // MONTH : 0���� �����̶� +1 ���ش�
		int day 	  = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // ����ǥ��, �Ͽ���=1 ����
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY); // 24�ð���
		int ampm	  = cal.get(Calendar.AM_PM);
		int hour 	  = cal.get(Calendar.HOUR);
		int min 	  = cal.get(Calendar.MINUTE);
		int sec 	  = cal.get(Calendar.SECOND);
		int millisec  = cal.get(Calendar.MILLISECOND);

		System.out.print(msg + " " + year + "/"+month+"/"+day+"/");
		switch(dayOfWeek) {
		case Calendar.SUNDAY : 	  System.out.print("�Ͽ���");break;
		case Calendar.MONDAY : 	  System.out.print("������");break;
		case Calendar.TUESDAY :   System.out.print("ȭ����");break;
		case Calendar.WEDNESDAY : System.out.print("������");break;
		case Calendar.THURSDAY :  System.out.print("�����");break;
		case Calendar.FRIDAY :    System.out.print("�ݿ���");break;
		case Calendar.SATURDAY :  System.out.print("�����");break;
		}
		System.out.print(" ("+hourOfDay+"��) ");
		if(ampm == Calendar.AM) System.out.print("���� ");
		else System.out.print("���� ");
		System.out.println(hour+"�� "+min+"�� "+sec+"�� "+millisec+"�и���");
	}
}
