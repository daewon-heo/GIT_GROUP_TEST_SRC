package com.group.test3.miniproject.cardgame.run;

import com.group.test3.miniproject.cardgame.controller.GameController;

public class Main {
	public static void main(String[] args) {
		final int TOTAL_PLAER = 4;			// 전체 플레이어 수
	    final int HUMAN_PLAYER = 1;			// 사람플레이어, 키보드로 입력을 받는 플레이어 수
	    final int CARD_PER_PLAYER = 10;		// 플레이어당 가지는 카드 개수
	    
		GameController game = 
				new GameController(TOTAL_PLAER, HUMAN_PLAYER, CARD_PER_PLAYER);
		
		game.startGame();
	}
}
