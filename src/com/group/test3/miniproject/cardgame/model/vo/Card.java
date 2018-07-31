package com.group.test3.miniproject.cardgame.model.vo;

public class Card {
	// 패턴 우선순위
	public static final int SPADE  = 4;
	public static final int DIA    = 3;
	public static final int HEART  = 2;
	public static final int CLOVER = 1;
	
	public static final int[] PATTERN = {SPADE,DIA,HEART,CLOVER};
	
	private int pattern;
	private int number;
	
	// 생성자
	// 숫자로 생성
	public Card(int pattern,int number) {
		this.pattern = pattern;
		this.number = number;
	}

	// getter & setter
	public int getNumber() { return number; }
	public void setNumber(int number) { this.number = number; }
	public int getPattern() { return pattern; }
	public void setPattern(int pattern) { this.pattern = pattern; }
}
