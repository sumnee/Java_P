package com.kh.day11.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {

	public static void main(String[] args) {
		// 간단한 달력 java.util
		Date date = new Date();
		System.out.println(date); //지금시간
		
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String transDate1 = trans.format(date);
		System.out.println(transDate1);
		
		SimpleDateFormat trans2 = new SimpleDateFormat("YYYY/mm/DD hh:MM:SS"); //대소문자에 따라 의미 상이
		String transDate2 = trans2.format(date);
		System.out.println(transDate2);
		
		
		//그래고리안캘린더
		
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTime());
		
		String changed = trans.format(calendar.getTime());
		System.out.println("Changed : " + changed);
		

	}

}
