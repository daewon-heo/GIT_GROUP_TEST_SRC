package com.group.test.exam3;

public class Test3 {
	/*
	 * 3. 0~9 사이의 랜덤 정수 10개를 입력받은 후 출력. 
	 * 출력된 수에서, 연속된 숫자를 빼고 다시 출력. 
	 * *ex)
	 * 1,1,3,3,5,6,2,2,9,0 =>1, 3, 5, 6, 2, 9, 0
	 */
	public void test() {
		final int NUM = 10;
		int[] arr = new int[NUM];

		//for문 한번에
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*10);
//			if(i == 0){
//				System.out.println(arr[i]);
//			}else{
//				if(arr[i-1] != arr[i]){
//					System.out.println(arr[i]);
//				}
//			}
//		}
		
		// 생성,출력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n중복 제거후 출력");
		// 중복 제거 후 출력
		for(int i = 0 ; i < arr.length; i++){
			if(i == 0){
				System.out.print(arr[i] + " ");
			}else{
				if(arr[i-1] != arr[i]){
					System.out.print(arr[i] + " ");
			}
		}
	}
		
		

	}
}
