package com.hibernate.startup;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Pagination {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Query query = session.createQuery("from Student");

		// Pagination values, Start from rowid (3) and show number of records
		// (3)
		query.setFirstResult(3);
		query.setMaxResults(3);

		List students = query.list();

		Iterator it = students.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

		session.getTransaction().commit();
		session.close();
	}
}
