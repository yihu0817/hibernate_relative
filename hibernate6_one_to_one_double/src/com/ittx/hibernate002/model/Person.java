package com.ittx.hibernate002.model;

/**
 * 一对一双向关联
 * 实体类 多对一实体实现一样
 * 
 * Person 人- Card 身份证
 * 
 * 
 * @author viktor.zhou
 *
 */
public class Person {
	private int id;       
	private String name;
	private Card card;

	public Person() {
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}

	
}
