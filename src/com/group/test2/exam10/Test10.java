package com.group.test2.exam10;

import java.util.Scanner;

public class Test10 {
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		Player player = new Player(name);
		Player com = new Player();
		
		do {
			System.out.println("\n준비");
			System.out.print(player.getName() + " : ");
			
			String comKbb = com.kbb();
			int result = Test10.vsPlayer(player.kbb(sc.nextLine()), comKbb);
			
			if(result == -1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			System.out.println("컴퓨터 : " + comKbb);
			
			if(result == 0) {
			// 무승부
				System.out.println("무승부 입니다.");
			}else if (result == 1) {
			// 플레이어 승
				System.out.println(player.getName() + " 승");
				Test10.scoreCheck(player, com);
			}else if(result == 2) {
			// 컴퓨터 승
				System.out.println(com.getName() + " 승");
				Test10.scoreCheck(com, player);
			}
			
			player.printScore();
			com.printScore();
			
			if(player.getWin() == 3 || com.getWin() == 3) {
				if(player.getWin() > com.getWin()) {
					System.out.println(player.getName() + " 승");
				}else {
					System.out.println(com.getName() + " 승");
				}
				break;
			}
		}while(true);
		
		System.out.println("게임을 종료 합니다.");
	}
	
	public static int vsPlayer(String sel1, String sel2) {
		// 0 무승부
		// 1 플레이어 승
		// 2 컴퓨터 승
		// -1 잘못된 입력
		int result = 0;
		switch (sel1) {
		case "가위":
			if(sel2.equals("가위")) result = 0;
			if(sel2.equals("바위")) result = 2;
			if(sel2.equals("보")) result = 1;
			break;
		case "바위":
			if(sel2.equals("가위")) result = 1;
			if(sel2.equals("바위")) result = 0;
			if(sel2.equals("보")) result = 2;
			break;
		case "보":
			if(sel2.equals("가위")) result = 2;
			if(sel2.equals("바위")) result = 1;
			if(sel2.equals("보")) result = 0;
			break;
		default:
			result = -1;
			break;
		}
		
		return result;
	}
	
	public static void scoreCheck(Player win, Player loss) {
		win.countScore(true);
		loss.countScore(false);
	}
}

class Player {
	private String name;
	private int win;
	private int loss;
	private boolean isCom;
	
	public Player() {
		name = "컴퓨터";
		isCom = true; 
	}
	
	public Player(String name) {
		this.name = name;
		isCom = false;
	}
	
	// 선택해서 출력
	public String kbb(String select) {
		return select;
	}
	
	// 랜덤으로 출력
	public String kbb() {
		String[] select = {"가위","바위","보"};
		return select[(int)(Math.random()*3)]; 
	}
	
	public void printScore() {
		System.out.println(name + " : " + win + "승 " + loss + " 패");
	}
	
	public void countScore(boolean win) {
		if(win)
			this.win++;
		else 
			this.loss++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLoss() {
		return loss;
	}

	public void setLoss(int loss) {
		this.loss = loss;
	}

	public boolean isCom() {
		return isCom;
	}

	public void setCom(boolean isCom) {
		this.isCom = isCom;
	}
}
