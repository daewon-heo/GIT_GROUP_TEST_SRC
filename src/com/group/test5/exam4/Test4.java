package com.group.test5.exam4;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test4 {
	public void test() {
		try(BufferedReader br = new BufferedReader(new FileReader("abc.txt"));){
			String abc = null;
			while (br.ready()) {
				 abc = br.readLine();
			}
			
			for (int i = 0; i < abc.length(); i++) {
				if(i%3 == 0 && i != 0) System.out.println();
				System.out.print(abc.toUpperCase().charAt(i));
			}
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
