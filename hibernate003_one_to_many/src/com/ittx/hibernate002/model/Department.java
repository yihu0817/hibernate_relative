package com.ittx.hibernate002.model;

import java.util.Set;

/**
 * 一对多单向关联
 * 
 * 
 * @author viktor.zhou
 *
 */
public class Department {
	private int id;
	private String name;
	private Set<Employee> employes;

	public Department() {
	}

	public Department(String name) {
		this.name = name;
	}
	
	public Department(int id, String name) {
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

	public Set<Employee> getEmployes() {
		return employes;
	}

	public void setEmployes(Set<Employee> employes) {
		this.employes = employes;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", employes=" + employes + "]";
	}
	
	
}
