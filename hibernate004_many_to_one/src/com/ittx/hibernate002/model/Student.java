package com.ittx.hibernate002.model;
/**
 * 多对一单向关联
 * 
 * 多端持有一端实例
 * 
 * 
 * @author viktor.zhou
 *
 */
public class Student {
	private int id;
	private int number; // 学号
	private String name; // 姓名
	private Grade grade; //班级
	
	public Student() {
		
	}
	public Student(int id, int number, String name, Grade grade) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.grade = grade;
	}
	public Student(int id, int number, String name) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
	}
	public Student(int number, String name) {

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

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

}
