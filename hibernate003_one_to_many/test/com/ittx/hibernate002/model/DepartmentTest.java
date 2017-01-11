package com.ittx.hibernate002.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ittx.hibernate002.utils.HibernateUtil;

public class DepartmentTest {
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
		Employee e1 = new Employee("小明",2400);
		Employee e2 = new Employee("张三",3500);
		
		Department d1 = new Department("产品部");
		Department d2 = new Department("开发部");
		
		Set<Employee> employes = new HashSet<Employee>();
		employes.add(e1);
		employes.add(e2);
		d1.setEmployes(employes);
		
		session.save(d1);
		session.save(d2);
		
		session.save(e1);
		session.save(e2);
	}
	
	@Test
	public void testQuery(){
		Department deparment = (Department) session.get(Department.class, 5);
		System.out.println(deparment);
		
		Set<Employee> employes = deparment.getEmployes();
		Iterator<Employee> iterator = employes.iterator();
		while(iterator.hasNext()){
			Employee employee= iterator.next();
			System.out.println(employee);
		}
		
	}

}
