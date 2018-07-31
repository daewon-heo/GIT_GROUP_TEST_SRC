package com.group.test4.exam2;

public class Card {
	private String pattern;
	private int number;

	public Card(String pattern, int number) {
		this.pattern = pattern;
		this.number = number;
	}
	
	public void printCard() {
		System.out.println(pattern + " " + number);
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
	
}
