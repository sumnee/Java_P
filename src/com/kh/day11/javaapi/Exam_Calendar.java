package com.kh.day11.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		Exam_Calendar ec = new Exam_Calendar();
		
		//출력시간
		Calendar today = Calendar.getInstance(); 
		ec.printCalendar("현재", today);
		System.out.println();
		
		//특정 시간
		//개강일
		Calendar some = Calendar.getInstance();
		some.clear();
		some.set(2022, 10, 23); //월 0부터 시작하는것 고려
		some.set(Calendar.HOUR_OF_DAY, 9);
		some.set(Calendar.MINUTE, 0);
		ec.printCalendar("개강일", some);
		System.out.println();
		
		
		//수료일
		Calendar end = Calendar.getInstance();
		end.clear();
		end.set(2023, 4, 2);
		end.set(Calendar.HOUR_OF_DAY, 17);
		end.set(Calendar.MINUTE, 50);
		ec.printCalendar("수료일", end);
	}

	public void printCalendar(String msg, Calendar cal) {	 //특정 시간을 출력하기 위해

		//Calendar cal = Calendar.getInstance(); // Calendar은 추상클래스라 new 안함
		
		int year 	  = cal.get(Calendar.YEAR);
		int month 	  = cal.get(Calendar.MONTH) + 1; // MONTH : 0부터 시작이라 +1 해준다
		int day 	  = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 요일표시, 일요일=1 시작
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY); // 24시간제
		int ampm	  = cal.get(Calendar.AM_PM);
		int hour 	  = cal.get(Calendar.HOUR);
		int min 	  = cal.get(Calendar.MINUTE);
		int sec 	  = cal.get(Calendar.SECOND);
		int millisec  = cal.get(Calendar.MILLISECOND);

		System.out.print(msg + " " + year + "/"+month+"/"+day+"/");
		switch(dayOfWeek) {
		case Calendar.SUNDAY : 	  System.out.print("일요일");break;
		case Calendar.MONDAY : 	  System.out.print("월요일");break;
		case Calendar.TUESDAY :   System.out.print("화요일");break;
		case Calendar.WEDNESDAY : System.out.print("수요일");break;
		case Calendar.THURSDAY :  System.out.print("목요일");break;
		case Calendar.FRIDAY :    System.out.print("금요일");break;
		case Calendar.SATURDAY :  System.out.print("토요일");break;
		}
		System.out.print(" ("+hourOfDay+"시) ");
		if(ampm == Calendar.AM) System.out.print("오전 ");
		else System.out.print("오후 ");
		System.out.println(hour+"시 "+min+"분 "+sec+"초 "+millisec+"밀리초");
	}
}
