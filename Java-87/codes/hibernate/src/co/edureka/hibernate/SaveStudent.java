package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.hibernate.entity.Student;

public class SaveStudent {

	public static void main(String[] args) {
		// Initialize the session factory
		Configuration config = new Configuration();
		config.configure("co/edureka/hibernate/configs/hibernate.cfg.xml");
		SessionFactory sfactory = config.buildSessionFactory();
		
		//get the Session - connection with DB
		Session session = sfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Student st = new Student();
		st.setStudentId(101);
		st.setStudentName("Sunil");
		st.setStudentEmail("sunil@gmail.com");
		st.setStudentMobile("9848586878");
		
		//save the student instance with hibernate session
		session.save(st);
		
		System.out.println("-------------------------------------");
		
		tx.commit(); //generates SQL query, connects to DB, executes query
		
		session.close();
		sfactory.close();
	}

}
