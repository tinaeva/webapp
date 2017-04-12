package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.demo.model.Book;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		Book b1 = new Book("SOAP", 22.33, "TechMedia");
		Book b2 = new Book("Rule Engines", 9.26, "Wrox");
		
		session.save(b1);
		session.save(b2);
		tran.commit();
		System.out.println("Saved Books!");
		
	}

}
