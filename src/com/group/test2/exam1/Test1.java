package com.group.test2.exam1;

import java.util.Scanner;

public class Test1 {
	public void test(){
		Scanner sc = new Scanner(System.in);
		System.out.print("인치(inch) 입력 : ");
		double inch = sc.nextDouble();
		sc.nextLine();
		
		double cm = inch*2.54;
		System.out.printf("%.2finch는 %.2fcm 입니다.", inch, cm);
		//test
	}
}
