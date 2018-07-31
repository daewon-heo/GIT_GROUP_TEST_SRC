package com.group.test.exam4;

import java.util.Arrays;

public class Test4 {
	/*
	 * 4.
	 *	1~100에서 소수 구하기.
	 *	구한 소수를 내림차순으로 출력
	 */
	
	public void test(){
		final int NUM = 100;
		int[] arr = new int[NUM];
		int count = 0;
		
		// 소수 구하기
		for(int i = 2; i <= NUM; i++){
			for (int j = 1; j <= NUM; j++) {
				if(i%j == 0){
					count++;
				}
				
				if(j == NUM && count==2){
					arr[i] = i;
				}
			}
			count = 0;
		}
		
		// 출력부
		for (int i = 0; i < NUM; i++) {
			if(arr[i] != 0)
				System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n내림차순 출력");
		// 출력부
		for (int i = NUM-1; i > 0; i--) {
			if(arr[i] != 0)
				System.out.print(arr[i] + " ");
		}
	}
}
