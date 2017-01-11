package com.ittx.hibernate002.model;

import static org.junit.Assert.*;

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
	public void test() {
		Grade grade1 = new Grade(3001,"java1606");
		Grade grade2 = new Grade(3002,"android");
		
		Student studentZ = new Student(1001,"张三");
		Student studentL = new Student(1002,"李四");
		
		session.save(studentZ);
		session.save(studentL);
		
		studentZ.setGrade(grade1);
		studentL.setGrade(grade2);
		
		session.save(grade1);
		session.save(grade2);
		
	}

}
