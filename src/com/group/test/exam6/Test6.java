package com.group.test.exam6;

import java.util.Scanner;

public class Test6 {
	/*
	 * 6.
	 *	n명에게 3번씩 정수입력을 받은 후 모두 더해서 출력하기.
	 *	ex) n == 2 
	 *	1명 -> 10 20 30
	 *	2명 -> 30 20 30
	 *	출력 : 102030302030
	 */
	public void test(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 n 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[num];
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수 3개 입력(space) : ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			
			result += ""+num1+num2+num3;
		}
		System.out.println("출력 : " + result);
	}
}
