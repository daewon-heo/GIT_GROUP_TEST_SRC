package com.group.test.exam10;

import java.util.Scanner;

public class Test10 {
/*
	10.
	String 이차원 배열 10x10 선언후
	각 배열 값에 행열값 채운 후 출력하기.
	
	출력후 사용자 입력으로 행,열 값 입력받아 해당값을 제외한 나머지 값들 출력
	
	ex)
	(0,0) (0,1) (0,2) (0,3) ......(0,9)
	(1,0) (1,1) (1,2) (1,3) ......(1,9)
	...
	...
	(9,0) (9,1) .........................(9,9)
	
	제거할 행 입력 : 0
	제거할 열 입력 : 2
	
	(0,0) (0,1)       (0,3) ......(0,9)
	(1,0) (1,1) (1,2) (1,3) ......(1,9)
	...
	...
	(9,0) (9,1) .........................(9,9)
*/
	public void test(){
		String[][] strArr = new String[10][10];
		
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				strArr[i][j] = "("+i + "," + j +")";
			}
		}
		
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[i][j] + "\t");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("제거할 행 입력 : " );
		int row = sc.nextInt();
		System.out.print("제거할 열 입력 : " );
		int col = sc.nextInt();
		
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				if(i == row && j == col){
					System.out.print("   " + "\t");
				}else{
					System.out.print(strArr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
}
