package com.ittx.hibernate002.model;

import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ittx.hibernate002.utils.HibernateUtil;

public class GradeTest {
	Session session;
	@Before
	public void setUp() throws Exception {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
	}

	@After
	public void tearDown() throws Exception {
		session.getTransaction().commit();
	}

	@Test
	public void testGrade() {
		Student studentZ = new Student(1,1001,"张三");
		Student studentL = new Student(2,1002,"李四");
		
		session.save(studentZ);
		session.save(studentL);
		
		HashSet<Student> students = new HashSet<>();
		students.add(studentZ);
		students.add(studentL);
		
		Grade grade = new Grade(21,"java1606","java开发学习");
		grade.setStudents(students); //学生集合和班级关联
		
		session.save(grade);
	}

}
