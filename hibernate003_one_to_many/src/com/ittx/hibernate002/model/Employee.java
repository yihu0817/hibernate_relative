package com.ittx.hibernate002.model;

/**
 *  Employee  - Deparment
 *  多 对 一 单向关联
 * 
 * 
 * @author viktor.zhou
 *
 */
public class Employee {
	private int id;
	private String name;
	private int salary;
	
	public Employee() {
	}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
