package com.group.test.exam1;

import java.awt.image.SampleModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test1 {
	/*
	 * 1.
	 *	 2016년 1월 1일이 금요일일때, 2월 부터 12월 까지의 1일의 요일 출력하기
	 *	*2016년은 윤년
	 */
	public void test(){
		int[] arr = {31,29,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"목","금","토","일","월","화","수"};

		int num = 1;
		for(int i = 0; i < arr.length; i++){
			System.out.print((i+1) + "월");
			for (int j = 0; j < arr[i]; j++) {
				if(j == 0){
					System.out.print((j+1) + "일 ");
					System.out.println(day[num%7]);
				}
				num++;
			}
//			System.out.println();
		}
		
		//2.
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 E요일");
		for(int i = 1; i <= 11; i++){
			cal.set(2016, i, 1);
			System.out.println(sdf.format(cal.getTime()));
		}
	}
}
