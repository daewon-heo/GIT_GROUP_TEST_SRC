package com.group.test3.miniproject.cardgame.view;

import java.util.ArrayList;
import java.util.Scanner;
import com.group.test3.miniproject.cardgame.model.vo.Card;

public class GameView {
	public void printCard(Card card) {
		String pattern = "";
		switch (card.getPattern()) {
		case Card.SPADE:
			pattern = "SPADE\t";
			break;
		case Card.DIA:
			pattern = "DIAMOND\t";
			break;
		case Card.HEART:
			pattern = "HEART\t";
			break;
		case Card.CLOVER:
			pattern = "CLOVER\t";
			break;
		}
		
		if(card.getNumber() > 10) {
			switch (card.getNumber()) {
			case 11:
				pattern += "J"; 
				break;
			case 12:
				pattern += "Q"; 
				break;
			case 13:
				pattern += "K"; 
				break;
			}
		}else {
			pattern += card.getNumber();
		}
		
		System.out.println(pattern);
	}

	public void printAllCardList(ArrayList<Card> cardList) {
		System.out.println("현재 가진 카드 "+ cardList.size() + "장");
		int cardNumber = 1;
		for(Card card : cardList) {
			System.out.print((cardNumber++) + ". ");
			printCard(card);
		}
		System.out.println("카드 출력 완료!!!\n");
	}
	
	public int selectCard(String name) {
		Scanner sc = new Scanner(System.in);
		int card;
		do {
			System.out.print("\n[" + name  + "] 카드 선택 (카드번호 선택) : ");
			try {
				card = Integer.parseInt(sc.nextLine());
				
				if(card < 1 || card > 10) {
					System.out.println("올바른 카드 번호를 선택해주세요!!");
				}else {
					break;
				}
			}catch (NumberFormatException e) {
				System.out.println("올바른 카드 번호를 선택해 주세요.");
			}
		}while(true);
		
		return card;
	}
	
	public void viewPrint(String str) {
		System.out.println(str);
	}
	
	public void viewClear() {
		for (int i = 0; i < 80; i++) {
			System.out.println();
		}
	}
}
