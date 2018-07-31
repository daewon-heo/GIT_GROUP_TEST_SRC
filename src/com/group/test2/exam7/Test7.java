package com.group.test2.exam7;

import java.util.Scanner;

public class Test7 {
/*
*문자 2개와 정수 1개를 입력받는다. 정수는 1 ~ 100
해당 문자를 1개 부터 출력해서 아래와 같이 출력한다.

ex)
첫번째 문자 입력 : *
두번째 문자 입력 : @
정수 입력 : 5
출력
*@**@@***@@@****@@@@*****@@@@@
 */
	public void test(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 문자 입력 : ");
		char ch1 = sc.nextLine().charAt(0);
		
		System.out.print("두번째 문자 입력 : ");
		char ch2 = sc.nextLine().charAt(0);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("출력");
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch1);
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(ch2);
			}
		}
	}
}
