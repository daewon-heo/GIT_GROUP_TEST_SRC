package com.group.test2.exam5;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
	// 문제 다시 풀기
	
	public void test(){
		int[][] arr = new int[3][3];
		int[] sumArr = new int[9];
		ArrSum[] rank = new ArrSum[6];
		List<Integer> list = new ArrayList<>();

		// list 사용
		for(int i=1; i <= 9; i++){
			list.add(i);
		}
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0 ; j < arr[i].length; j++){
				int rand = (int)(Math.random()*list.size());
				arr[i][j] = list.get(rand);
				list.remove(rand);
			}
		}
		
		System.out.println("배열출력");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n배열의 합 출력");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "행의 합 : " + getSumRow(arr, i));
			System.out.println((i+1) + "열의 합 : " + getSumCol(arr, i));
			rank[count++] = new ArrSum(i, "행", getSumRow(arr, i));
			rank[count++] = new ArrSum(i, "열", getSumCol(arr, i));
		}
		
		System.out.println();
		for (int i = 0; i < rank.length; i++) {
			rank[i].info();
		}
	}
	
	public int getSumRow(int[][] arr, int row){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i == row)
					sum += arr[i][j];
			}
		}
		return sum;
	}
	
	public int getSumCol(int[][] arr, int col){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j == col)
					sum += arr[i][j];
			}
		}
		return sum;
	}
}

class ArrSum{
	int num;
	String name;
	int sum;
	
	public ArrSum(int num, String name, int sum){
		this.num = num;
		this.name = name;
		this.sum = sum;
	}
	
	public void info(){
		System.out.println(num + name + "의 합 : " + sum);
	}
}
