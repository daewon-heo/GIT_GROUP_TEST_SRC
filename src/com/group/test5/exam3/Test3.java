package com.group.test5.exam3;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Test3 {
	public void test() {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));){
			for(char i = 'a'; i <= 'z'; i++) {
				bw.write(i);
			}
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
