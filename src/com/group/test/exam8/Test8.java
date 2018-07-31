package com.group.test.exam8;

public class Test8 {
	/*
	 *	8.
	 *	-10 ~ 10에서 랜덤으로 정수 5개를 출력후 절대값으로 모두 더하기.
	 */
	public void test(){
		int[] arr = new int[5];
		
		// 입력부
		for(int i = 0 ; i < arr.length; i++){
			arr[i] = (int)(Math.random()*21)-10;
		}
		
		// 출력부
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		// 결과 계산
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += Math.abs(arr[i]);
		}
		
		System.out.println("결과 : " + sum);
	}
}
