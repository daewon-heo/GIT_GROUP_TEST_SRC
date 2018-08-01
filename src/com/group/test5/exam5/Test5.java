package com.group.test5.exam5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test5 {
	public void test() {
		String text1 = fileReader("test1.txt");
		String text2 = fileReader("test2.txt");
		
		fileWriter("test1.txt", text2);
		fileWriter("test2.txt", text1);
	}
	
	public String fileReader(String filename) {
		String str = null;
		try(BufferedReader br = new BufferedReader(new FileReader(filename));){
			str = br.readLine();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return str;
	}
	
	public void fileWriter(String filename, String text) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename));){
			bw.write(text);
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
