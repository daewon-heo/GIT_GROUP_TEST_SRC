package com.group.test3.miniproject.cardgame.model.vo;

import java.util.ArrayList;

import com.group.test3.miniproject.cardgame.controller.GameController;

public class Player {
	private String name;
	private ArrayList<Card> cardList;
	private int score;

	// 생성자 오버로딩
	public Player(int num) {
		// 이름을 주지 않을 경우 컴퓨터로 하나 생성한다.
		this.name = "COM" + num;
		init();
	}

	public Player(String name, int num) {
		// 이름을 줄경우 플레이어로 생성한다.
		this.name = name + num;
		init();
	}
	
	public void init() {
		cardList = new ArrayList<>();
	}

	public void plusScore() {
		// 승리했을경우 점수 1증가
		this.score++;
	}

	// 메소드 오버로딩
	public Card popCard() {
		// 입력이 없을때 랜덤으로 한장 뽑는다.(컴퓨터)
		Card card;

		// 랜덤으로 카드 한장 뽑고 그 카드의 정보로 카드 만든 후
		// 카드셋에서 그 카드 제거
		int rand = (int) (Math.random() * cardList.size());
		card = new Card(cardList.get(rand).getPattern(), cardList.get(rand).getNumber());
		cardList.remove(rand);

		return card;
	}

	public Card popCard(int input) {
		return cardList.get(input-1);
	}

//	// 입력한 문자열(패턴,넘버)이 카드셋에 있는지 확인
//	public int indexCardInCardSet(String pattern, String number) {
//		int cnt = 0;
//		int remove = -1;
//
//		for (Card card : cardList) {
//			int[] cardArr = stringToInt(pattern, number);
//			if(cardArr[0] != 0 && cardArr[0] != 0) {
//				if ((card.getPattern() == cardArr[0]) && (card.getPattern() == cardArr[1])) {
//					remove = cnt;
//				}
//			}
//			cnt++;
//		}
//		return remove;
//	}

	// 입력받은 문자열을 숫자로 변환해서 비교한다.
//	public int[] stringToInt(String pattern, String number) {
//		int[] card = new int[2];
//
//		switch (pattern) {
//		case "스페이드":
//			card[0] = 4;
//			break;
//		case "다이아":
//			card[0] = 3;
//			break;
//		case "하트":
//			card[0] = 2;
//			break;
//		case "클로버":
//			card[0] = 1;
//			break;
//		default:
//			card[0] = 0;
//			break;
//		}
//
//		try {
//			int num = Integer.parseInt(number);
//			if (num >= 1 && num <= 10) {
//				card[1] = num;
//			}
//		} catch (NumberFormatException e) {
//			if (number.toUpperCase().equals("K"))
//				card[1] = 13;
//			if (number.toUpperCase().equals("Q"))
//				card[1] = 12;
//			if (number.toUpperCase().equals("J"))
//				card[1] = 11;
//		} catch (Exception e) {
//			System.out.println("에러났습니다.");
//			System.out.println(e.getMessage());
//			card[1] = 0;
//		}
//
//		return card;
//	}

	// getter & setter
	public ArrayList<Card> getCardList() { return cardList; }
	public void setCardList(ArrayList<Card> cardList) { this.cardList = cardList; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getScore() { return score; }
	public void setScore(int score) { this.score = score; }
}
