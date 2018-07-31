package com.group.test2.exam2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test2 {
	// 시차 -16시간
	public void test(){
		Calendar cal = new GregorianCalendar();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		TimeClass seoul = new TimeClass(year, month, day, hour, minute, "SEOUL");
		TimeClass la = new TimeClass(year, month, day, hour-16, minute, "LA");
		
		System.out.println(seoul.printInfoTime());
		System.out.println(la.printInfoTime());
	}
}

class TimeClass{
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private String region;
	
	public TimeClass(int year, int month, int day, int hour, int minute, String region) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = checkHour(hour);
		this.minute = minute;
		this.region = region;
	}
	
	public int checkHour(int hour){
		if(hour < 0){
			hour += 24;
			setDay(--day);
		}else if(hour > 24){
			hour -= 24;
			setDay(++day);
		}
		if(hour < 0 || hour > 24){
			hour = checkHour(hour);
		}
		
		return hour;
	}
	
	public String printInfoTime(){
		String result = region + "의 현재 시간은 " + year + "년 " + month + "월 " + day + "일 " + hour + "시 " + minute + "분 입니다.";
		return result;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = checkHour(hour);
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
}
