package com.ittx.hibernate002.model;

public class Card {
	private int id;
	private long number; // 身份证号

	public Card() {
	}
	public Card(long number) {
		this.number = number;
	}
	public Card(int id, long number) {
		this.id = id;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

}
