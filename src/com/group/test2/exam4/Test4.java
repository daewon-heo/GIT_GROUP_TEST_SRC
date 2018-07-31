package com.group.test2.exam4;

import java.util.Scanner;

public class Test4 {
/*
  -회문 만들기
      사용자로부터 입력받은 문자열 s를 회문으로 만들어라.
  *문자열 s 는 1~20자로 제한
*/
	public void test(){
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		String palindrome = str;
		
		for (int i = str.length()-1; i >= 0; i--) {
			palindrome += str.charAt(i);
		}
		System.out.println("회문 만들기");
		System.out.println(palindrome);
	}
}
