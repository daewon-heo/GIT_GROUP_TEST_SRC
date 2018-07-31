package com.group.test4.exam4;

import java.util.ArrayList;

public class Test4 {
	public void test() {
		ArrayList numList = new ArrayList();
		
		for (int i = 1; i <= 10; i++) {
			numList.add(i);
		}
		
		for (int i = 9; i >= 0; i--) {
			System.out.println(numList.get(i));
			numList.remove(i);
		}
		
		System.out.println("numList의 사이즈 : " + numList.size());
	}
}
