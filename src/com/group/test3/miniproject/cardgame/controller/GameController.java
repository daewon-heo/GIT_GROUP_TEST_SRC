package com.group.test3.miniproject.cardgame.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.group.test3.miniproject.cardgame.model.vo.Card;
import com.group.test3.miniproject.cardgame.model.vo.Player;
import com.group.test3.miniproject.cardgame.view.GameView;

public class GameController {
	private ArrayList<Player> playerList; // 전체 플레이어 리스트
	private ArrayList<Card> cardList; // 전체 카드리스트

	private int total_player_count; // 컴퓨터 + 사람 합친수
	private int human_player_count; // 사람인원수
	private int computer_player_count; // 전체 인원수 - 사람수 = 컴퓨터 인원
	private int card_per_player; // 한명당 가질 카드수
	
	GameView view;

	public GameController(int total_player_count, int human_player_count, int card_per_player) {
		this.total_player_count = total_player_count;
		this.human_player_count = human_player_count;
		this.computer_player_count = total_player_count - human_player_count;
		this.card_per_player = card_per_player;
		playerList = new ArrayList<>();
		cardList = new ArrayList<>();
		view = new GameView();

		init();
	}

	public void init() {
		view.viewPrint("게임 준비중 ..\n");
		cardListSetting();
		playerSetting();
		cardSplit();
		view.viewPrint("게임 준비끝!!!\n");
	}

	// 카드셋 만들기
	public void cardListSetting() {
		view.viewPrint("카드셋 만드는중 ....");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 13; j++) {
				cardList.add(new Card(i, j));
			}
		}
		view.viewPrint("카드셋 완료!!!\n");
	}

	// 컴퓨터와 플레이어를 리스트에 추가
	public void playerSetting() {
		view.viewPrint("플레이어 추가중 ....\n");
		Scanner sc = new Scanner(System.in);

		// 컴퓨터를 먼저 리스트에 추가
		for (int i = 0; i < computer_player_count; i++) {
			playerList.add(new Player(i + 1));
		}

		// 플레이어를 리스트에 추가
		for (int i = 0; i < human_player_count; i++) {
			System.out.print("플레이어 이름 입력 : ");
			String name = sc.nextLine();
			playerList.add(new Player(name, i + 1));
		}
		
		view.viewPrint("플레이어 추가완료!!!\n");
	}
	
	// 현재 플레이어 리스트에 분배할 카드 수만큼 나누기
	public void cardSplit() {
		view.viewPrint("카드 분배중.....");
		ArrayList<Card> cardList;
		// 플레이어 수만큼 반복
		for (int i = 0; i < total_player_count; i++) {
			cardList = new ArrayList<>();
			// 플레이어당 정해진 수만큼 가져가기
			for (int j = 0; j < card_per_player; j++) {
				int rand = (int) (Math.random() * (this.cardList.size()));
				playerList.get(i).getCardList().add(this.cardList.get(rand));
				cardList.add(this.cardList.get(rand));
				this.cardList.remove(rand);
			}
			playerList.get(i).setCardList(cardList);
		}
		view.viewPrint("카드 분배 완료!!!\n");
	}
	
	// 버리는 카드 리스트
	public void removeCardList() {
		System.out.println("------------------------------");
		System.out.println("버리는 카드 보기");
		int num = cardList.size();
		for (int i = 0; i < num; i++) {
			view.printCard(cardList.get(i));
		}
		System.out.println("------------------------------\n");
	}
	
	// 게임시작
	public void startGame() {
		removeCardList();
		
		int num = 0;
		while(num < card_per_player) {
			Card[] cards = new Card[total_player_count];
			
			for (int i = 0; i< total_player_count; i++) {
				if(!playerList.get(i).getName().substring(0, 3).equals("COM")) {
					int input = view.selectCard(playerList.get(i).getName());
					cards[i] = playerList.get(i).popCard(input);
				}else {
					cards[i] = playerList.get(i).popCard();
				}
			}
			int winIndex = cardRankCheck(cards);
			winPlayer(playerList.get(winIndex));
			num++;
		}
		System.out.println("게임을 종료합니다.\n");
		resultGame();
	}
	
	// 이긴 플레이어 1점 증가
	public void winPlayer(Player player) {
		player.plusScore();
	}
	
	// 카드 승자 체크 해서 index 리턴
	public int cardRankCheck(Card[] cards) {
		int maxIndex = -1;
		int maxValue = 0;
		
		for (int i = 0; i < cards.length-1; i++) {
			if(cards[i].getNumber() > cards[i+1].getNumber()) {
//				max = i;
			}
		}
		return 0;
	}
	
	public void allPlayerAllCardList() {
		System.out.println("=====================================");
		System.out.println("모든 플레이어의 카드상태 보기");
		for(Player player : playerList) {
			view.viewPrint(player.getName());
			view.printAllCardList(player.getCardList());
		}
		System.out.println("=====================================");
	}
	
	public void cardPop(Player player, int input) {
		System.out.print("[" + player.getName() + "] 선택한 카드 : ");
		
		if(input != -1) 
			view.printCard(player.popCard(input));
		else 
			view.printCard(player.popCard());
		
		view.printCard(player.popCard());
		System.out.println();
	}
	
//	public void cardPop(Player player, int input) {
//		System.out.print("[" + player.getName() + "] 선택한 카드 : ");
//		view.printCard(player.popCard(input));
//		System.out.println();
//	}
	
	public void resultGame() {
		view.viewPrint("결과 정리");
		// 게임 스코어 정리
		
		int max = 0;
		
		for (int i = 0; i < playerList.size(); i++) {
			view.viewPrint(playerList.get(i).getName() + "점 " + playerList.get(i).getScore());
		}
		
		view.viewPrint(playerList.get(max).getName() + " 승리!!!");
		
	}

	// getter & setter
	public int getCard_per_player() {return card_per_player;}
	public void setCard_per_player(int card_per_player) {this.card_per_player = card_per_player;}
	public ArrayList<Card> getCardList() {return cardList;}
	public void setCardList(ArrayList<Card> cardList) {this.cardList = cardList;}
	public ArrayList<Player> getPlayerList() {return playerList;}
	public void setPlayerList(ArrayList<Player> playerList) {this.playerList = playerList;}
	public int getTotal_player_count() {return total_player_count;}
	public void setTotal_player_count(int total_player_count) {this.total_player_count = total_player_count;}
	public int getComputer_player_count() {return computer_player_count;}
	public void setComputer_player_count(int computer_count) {this.computer_player_count = computer_count;}
	public int getHuman_player_count() {return human_player_count;}
	public void setHuman_player_count(int human_player_count) {this.human_player_count = human_player_count;}

}
