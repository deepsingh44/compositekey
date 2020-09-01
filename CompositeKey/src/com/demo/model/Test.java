package com.demo.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		Transaction txt = session.beginTransaction();

		TeacherKey t1 = new TeacherKey();
		t1.setEmail("ravi@gmail.com");
		t1.setMobile("0987654321");

		Teacher t = new Teacher();
		t.setTeacherKey(t1);
		t.setAddress("gzb");

		session.persist(t);
		txt.commit();
		System.out.println("success");
	}
}
