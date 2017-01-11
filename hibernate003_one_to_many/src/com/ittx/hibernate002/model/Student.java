package com.ittx.hibernate002.model;

public class Student {
	private int id;
	private int number; // 学号
	private String name; // 姓名

	public Student() {
	}

	public Student(int id, int number, String name) {
		this.id = id;
		this.number = number;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
