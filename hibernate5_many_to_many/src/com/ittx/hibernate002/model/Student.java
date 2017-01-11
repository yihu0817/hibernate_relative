package com.ittx.hibernate002.model;

import java.util.Set;
/**
 * 
 *  
	多对多单向关联映射
	 1. 在实体类中，跟一对多关联映射一样，也是用集合来表示的。
	 2. 在映射文件中
	   <set>标签中用table属性值是中间表名称，
	   <key>标签定义当前表（student）的主键 在中间表对应字段名
	   <many-to-many>标签来关联另一张表。
   
   
 * @author viktor.zhou
 *
 */
public class Student {
	private int id;
	private int number; // 学号
	private String name; // 姓名
	private Set<Course> coureLists; // 课程

	public Student() {
	}

	public Student(int id, int number, String name, Set<Course> coureLists) {
		this.id = id;
		this.number = number;
		this.name = name;
		this.coureLists = coureLists;
	}

	public Student(int number, String name, Set<Course> coureLists) {
		this.number = number;
		this.name = name;
		this.coureLists = coureLists;
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

	public Set<Course> getCoureLists() {
		return coureLists;
	}

	public void setCoureLists(Set<Course> coureLists) {
		this.coureLists = coureLists;
	}

}
