package com.group.test4.exam3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test3 {
	public void test() {
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd일 E요일");
		
		System.out.println("현재는 " + sdf.format(cal.getTime()) + " 입니다.");
		cal.set(Calendar.DATE, cal.get(Calendar.DAY_OF_MONTH)-cal.get(Calendar.DAY_OF_WEEK)+1);
		System.out.println("일요일은  " + sdf.format(cal.getTime()) + " 입니다.");
	}
}
