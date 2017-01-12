package com.ittx.hibernate001.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CacheTest {
	SessionFactory sessionFactory;
	Transaction transaction;
	Session session;

	@Before
	public void setUp() throws Exception {
		// 读取hibernate.cfg.xml文件
		Configuration config = new Configuration().configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties())
				.build();
		// 建立SessionFactory
		sessionFactory = config.buildSessionFactory(serviceRegistry);
		
	}

	
	@After
	public void tearDown() throws Exception {
		
		sessionFactory.close();
	}

	@Test
	public void testSaveStudent() {
		Student s1 = new Student("张三",23);
		Student s2 = new Student("小明",17);
		Student s3 = new Student("王二",26);
		Student s4 = new Student("麻子",22);
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
	}
	@Test
	public void testQueryCache(){
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		
		List<Student> list = session.createQuery("FROM Student").list();
		for(Student stu:list){
			System.out.println(stu);
//			if(stu.getNumber() != 1 ){
				session.evict(stu); //清除指定缓存对象
//			}
		}
//		transaction.commit();
//		session.close();
		
		//==================================
		//清除session缓存方式 两种 clear(),关闭session
//		session.clear(); 
		
		
//		session = sessionFactory.openSession();
//		transaction = session.beginTransaction();
		System.out.println("--------------------");
		Student student = (Student) session.get(Student.class, 1);
		Student stu2 = (Student) session.get(Student.class, 2);
		System.out.println(student);
		System.out.println(stu2);
		
		
		transaction.commit();
		session.close();
	}

	@Test
	public void teststate(){
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		
		Student s = new Student("小丽",57);  //临时状态
		session.save(s);   //持久化状态
		
		s.setName("小丽");

//		session.save(s);
		//提交事务之前，将session中数据和持久化数据进行比较，若不同则更新，
		transaction.commit(); 
		session.close();
	}
	

}
