package com.group.test4.exam2;

public class Test2 {
	public void test() {
		Card[] cards = new Card[20];
		String[] patterns = {"DIA", "HEART"};
		
		int num = 0;
		for(int i = 0; i < patterns.length;i++) {
			for (int j = 1; j < 11; j++) {
				cards[num++] = new Card(patterns[i], j);
			}
		}
		
		int rand = (int)(Math.random()*20) + 1;
		cards[rand].printCard();
	}
}

