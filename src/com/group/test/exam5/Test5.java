package com.group.test.exam5;

public class Test5 {
	/*
	 * 5. 1~100까지 합 구하기. 수행시간 출력하기.
	 */
	public void test() {
		// 시작 부분에 아래처럼 현재 시간을 계산하고
		long start = System.currentTimeMillis();
		System.out.println(start);

		// 프로그램 본문
//		System.out.println(5050);
//		System.out.println((100 * (100 + 1)) / 2);
		int sum = 0;
		for (int i = 0; i < 100000; i++) {
			sum += i;
		}
		// 끝에 아래와 같이 삽입

		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println("실행 시간 : " + (end - start) / 1000.0);
	}
}
