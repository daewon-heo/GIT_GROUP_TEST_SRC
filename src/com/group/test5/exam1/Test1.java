package com.group.test5.exam1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Test1 {
	public void test() {
		try(BufferedWriter br = new BufferedWriter(new FileWriter("text.txt"));){
			br.write("텍스트파일입니다.");
			br.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
