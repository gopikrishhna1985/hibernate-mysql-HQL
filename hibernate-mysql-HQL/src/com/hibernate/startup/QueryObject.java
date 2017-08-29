package com.hibernate.startup;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryObject {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// You can also do a select on the HQL query and obtain the result in
		// the list
		Query query = session.createQuery("from Student where age >= 3");

		List students = query.list();
		Iterator it = students.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

		session.getTransaction().commit();
		session.close();
	}
}
