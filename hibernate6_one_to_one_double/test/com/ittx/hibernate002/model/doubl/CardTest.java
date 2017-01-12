package com.ittx.hibernate002.model.doubl;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ittx.hibernate002.model.Card;
import com.ittx.hibernate002.model.Person;
import com.ittx.hibernate002.utils.HibernateUtil;

public class CardTest {
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
//		Person p1 = new Person("李四");
//		Card c1 = new Card(5129999);
//		p1.setCard(c1);  //建立关系
//		
//		session.save(c1);
//		session.save(p1);
		
		Card c1 = new Card(5121111);
		Person p1 = new Person("张三");
		c1.setPerson(p1); 
		
		session.saveOrUpdate(p1);
		session.saveOrUpdate(c1);
	}
	
	@Test
	public void testIcard(){
		Card c1 = new Card(5121111);
		Person p1 = new Person("张三");
		c1.setPerson(p1); 
		
		session.save(p1);
		session.save(c1);
	}

}
