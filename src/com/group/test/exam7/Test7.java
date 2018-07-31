package com.group.test.exam7;

import java.util.Scanner;

public class Test7 {
	/*
	 * 7. a~z까지 문자를 순서대로 char배열에 모두 할당 후, 사용자에게서 입력받은 문자가 몇번째 배열에 있는지 출력. ex)
	 * char[] arr = new char[26]; ... ... sysout("문자입력 : "); int num =
	 * sc.nextInt();
	 *
	 */

	public void test() {
		char[] chArr = new char[26];

		// 입력부
		int ch = 'a';
		for (int i = 0; i < chArr.length; i++) {
			chArr[i] = (char) ch++;
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력 : ");
		char search = sc.nextLine().charAt(0);

		// 출력부
		int num = 0;
		for (char str : chArr) {
			if (search == str) {
				System.out.println("결과 : " + search + " 는 " + num + "번째에 있습니다.");
				break;
			}
			num++;
		}
	}
}
