package com.group.test2.exam3;

import java.util.Scanner;

public class Test3 {
/*
*회문(回文) 또는 팰린드롬(palindrome)은 거꾸로 읽어도 제대로 읽는 것과 같은 문장이나 낱말이다. 
보통 낱말 사이에 있는 띄어쓰기나 문장 부호는 무시한다.
 
-회문 판단하기
사용자로부터 입력받은 문자열 s를 회문인지 아닌지 판단하여라.
회문일 경우 회문입니다. 아닐경우 회문이 아닙니다.
*문자열 s 는 1~20자로 제한	
 */

	public void test(){
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		boolean check = true;
		
		for(int i=0; i < str.length()/2; i++){
			if(str.charAt(i) != str.charAt(str.length()-i-1)){
				check = false;
//				System.out.println(str.charAt(i));
//				System.out.println(str.charAt(str.length()-i-1));
			}
		}
		
		if(check){
			System.out.println("회문입니다.");
		}else{
			System.out.println("회문이 아닙니다.");
		}
	}
}
