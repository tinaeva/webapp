/**
 * 
 */
package com.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Author;

/**
 * @author Ninni
 *
 */
public class Test {
	SessionFactory sessionFactory;
	
	Test() {
		try{
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			
			Session session = sessionFactory.openSession();
			Transaction t = session.beginTransaction();
			/*Author author1 = new Author("Jack", 34, "10020");
			Author author2 = new Author("Ross", 32, "10020");
			
			session.persist(author1);
			session.persist(author2);
			// only in memory, not push to db yet, have to use commit() the transaction
			t.commit();
			
			System.out.println("Saved");*/

			Query query = session.createQuery("from Author");
			List<Author> list = query.list();
			for(Author a : list) {
				System.out.println(a);
			}					
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test();
	}

}
