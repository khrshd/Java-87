package co.edureka.hibernate;

import org.hibernate.Session;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class UpdateStudent {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		
		/*
		Student st = new Student(101, "Sunil Joseph", "sunil@edureka.co","1234567890");
		session.update(st);
		*/
		
		Student st = session.get(Student.class, 101);
		
		if(st != null) {
			System.out.println(st);
			st.setStudentMobile("9848586878"); //dirty object
		}else {
			System.out.println("no matching student found!");
		}
		
		session.getTransaction().commit();
		session.close();
	}
}
