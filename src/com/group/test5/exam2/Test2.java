package com.group.test5.exam2;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test2 {
	public void test() {
		try (BufferedReader br = new BufferedReader(new FileReader("member.txt"));) {
			String members = br.readLine();
			System.out.println("읽은 문자열 : " + members);

			String[] memArr = members.split(",");

			System.out.println("조장 : " + memArr[0]);
			System.out.println("조원 : " + memArr[1] + " " + memArr[2] + " " +  memArr[3]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
