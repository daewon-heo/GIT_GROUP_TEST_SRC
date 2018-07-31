package com.group.test2.exam9;

import java.util.Scanner;

public class Test9 {
	/*
	 * 리모컨 프로그램 작성 Main에서 tv를 켜고, 채널이동, 볼륨 조절을 해본다. tv가 켜지지 않으면 다른 기능은 작동하지 않는다. tv를
	 * 끄면 프로그램 종료.
	 */

	// 리모컨 선택화면 출력
	// 티비가 꺼져있으면 리모컨 기능 불가.

	// 티비가 ON으로 리모컨 동작
	// 각종 기능

	// 티비가 OFF로 프로그램 종료

	public static boolean isTvOn = false;
	public static int CHANNEL = 1;
	public static int VOLUME = 10;

	public void test() {
		RemoteControl remocon = new RemoteControl();

		tv_loop: do {
			selectButton(remocon);

			if (Test9.isTvOn) {
				while (true) {
					selectButton(remocon);

					if (!Test9.isTvOn) {
						System.out.println("프로그램을 종료합니다.");
						break tv_loop;
					}
				}
			} else {
				System.out.println("tv가 꺼져있습니다.");
			}
		} while (true);
	}

	public void selectButton(RemoteControl remocon) {
		printMenu();

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");

		int select = sc.nextInt();
		sc.nextLine();

		clear();

		switch (select) {
		case 1:
			if (!Test9.isTvOn)
				remocon.tvOn();
			break;
		case 2:
			if (Test9.isTvOn)
				remocon.tvOff();
			break;
		case 3:
			if (Test9.isTvOn)
				remocon.chUp();
			break;
		case 4:
			if (Test9.isTvOn)
				remocon.chDown();
			break;
		case 5:
			if (Test9.isTvOn) {
				System.out.print("채널 입력 : ");
				int ch = sc.nextInt();
				sc.nextLine();
				remocon.chMove(ch);
			}
			break;
		case 6:
			if (Test9.isTvOn)
				remocon.volUp();
			break;
		case 7:
			if (Test9.isTvOn)
				remocon.volDown();
			break;
		case 8:
			if (Test9.isTvOn) {
				System.out.print("볼륨 입력 : ");
				int vol = sc.nextInt();
				sc.nextLine();
				remocon.volControl(vol);
			}
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}

		if (Test9.isTvOn)
			printTvStatus();
	}

	public void printMenu() {
		System.out.println();
		System.out.println("리모컨 버튼보기");
		System.out.println(
				"1.티비 켜기\t\t2.티비 끄기\t\t3.채널한칸위로\t4.채널한칸아래로" + "\n5.입력된번호로 채널이동\t6.볼륨 1증가\t7.볼륨1감소\t8.입력된만큼 볼륨 조절");
	}

	public void clear() {
		for (int i = 0; i < 80; i++) {
			System.out.println();
		}
	}

	public void printTvStatus() {
		System.out.println("현재 채널 : " + CHANNEL + " 음량 : " + VOLUME);
	}
}

class RemoteControl {
	public void tvOn() {
		// tv를 켠다.
		Test9.isTvOn = true;
		System.out.println("티비를 켭니다.");
	};

	public void tvOff() {
		// tv를 종료한다.
		Test9.isTvOn = false;
		System.out.println("티비를 끕니다.");
	};

	public void chUp() {
		// 현재 채널에서 한칸 위로 이동
		Test9.CHANNEL += 1;
		if (Test9.CHANNEL > 30) {
			Test9.CHANNEL = 1;
		}
	};

	public void chDown() {
		// 현재채널에서 한칸 아래로 이동
		Test9.CHANNEL -= 1;
		if (Test9.CHANNEL < 1) {
			Test9.CHANNEL = 30;
		}
	};

	public void chMove(int num) {
		// 입력된 번호로 채널 이동
		if(num < 1)
			num = 1;
		Test9.CHANNEL = num;
	};

	public void volUp() {
		// 볼륨을 +1 조절
		Test9.VOLUME += 1;
		if (Test9.VOLUME >= 100) {
			Test9.VOLUME = 100;
		}
	};

	public void volDown() {
		// 볼륨을 -1 조절
		Test9.VOLUME -= 1;
		if (Test9.VOLUME <= 0) {
			Test9.VOLUME = 0;
		}
	};

	public void volControl(int num) {
		// 입력된 수 만큼 볼륨 조절 +,- (*볼륨은 0이하 100초과로 가지 않는다.)
		if (num < 0)
			num = 0;
		if (num > 100)
			num = 100;

		Test9.VOLUME = num;
	};
}
