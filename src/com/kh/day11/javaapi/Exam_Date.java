package com.kh.day11.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {

	public static void main(String[] args) {
		// ������ �޷� java.util
		Date date = new Date();
		System.out.println(date); //���ݽð�
		
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String transDate1 = trans.format(date);
		System.out.println(transDate1);
		
		SimpleDateFormat trans2 = new SimpleDateFormat("YYYY/mm/DD hh:MM:SS"); //��ҹ��ڿ� ���� �ǹ� ����
		String transDate2 = trans2.format(date);
		System.out.println(transDate2);
		
		
		//�׷�����Ķ����
		
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTime());
		
		String changed = trans.format(calendar.getTime());
		System.out.println("Changed : " + changed);
		

	}

}
