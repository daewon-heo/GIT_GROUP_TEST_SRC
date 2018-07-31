package com.group.test.exam2;

public class Test2 {
	/*
	 * 2.
	 *	문자열s의 가운데 글자 s를 반환하는 함수 작성.
	 *	문자열이 짝수일 경우 "error"출력
	 * 	*s의 길이는 1~100
	 */
	public void test(){
		// 문자열 s
		String s = "abcwede";

		// 문자열 길이 체크
		int length = s.length();
		int mid = length/2;
		
		// 짝수
		if(length%2 ==0){
			System.out.println("error");
		}else{ // 홀수
			System.out.println(s.charAt(mid));
		}
	}

}
