package com.ittx.hibernate002.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ittx.hibernate002.utils.HibernateUtil;

public class CourseTest {

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
		Course c1 = new Course("java");
		Course c2 = new Course("android");
		
		Set<Course> coursLists = new HashSet<>();
		coursLists.add(c1);
		coursLists.add(c2);
		
		Student s1 = new Student(1001,"张三",coursLists);
		
		session.save(c1);
		session.save(c2);
		session.save(s1);
		
	}

}
