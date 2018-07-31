package com.group.test4.exam1;

public class Test1 {
	public void test() {
		String str = "국어:70,영어:60,수학:60,총점:0,평균:0";
		
		String[] scores = str.split(",");
		
		int sum = 0;
		for(int i = 0 ; i < scores.length-2; i++) {
			String[] arr = scores[i].split(":");
			System.out.println(arr[0]+ "점수는 : " + arr[1] + "점");
			sum += Integer.parseInt(arr[1]);
		}
		double avg = sum/3.0;
		System.out.println("총 점수는 : " + sum);
		System.out.printf("평균은 : %.2f입니다.",avg);
		
	}
}
