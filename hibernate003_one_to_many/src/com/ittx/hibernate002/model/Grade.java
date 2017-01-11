package com.ittx.hibernate002.model;

import java.util.Set;

/**
 * 一对多单向关联
 * 班级 grade ——> 学生 student
 * 表 table
 *   通过主外键实现,一方的主键 作为 多方外键
 * 类 class
 *   一方持有多方集合实现，即在'一'的一端中使用<set>元素表示持有'多'的一端对象
 * 
 * 
 * @author viktor.zhou
 *
 */
public class Grade {
	private int id;
	private String name;
	private String description;
	private Set<Student> students;
	
	public Grade() {
	}

	public Grade(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", name=" + name + ", description=" + description + ", students=" + students + "]";
	}
	
	
}
