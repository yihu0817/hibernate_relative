package com.ittx.hibernate002.model;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ittx.hibernate002.utils.HibernateUtil;

public class PersonTest {
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
		Person p1 = new Person("张三");
		Card c1 = new Card(5128888);
		p1.setCard(c1);  //建立关系
		
		session.save(p1);
		session.save(c1);
		
	}

}
