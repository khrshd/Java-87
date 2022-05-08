package co.edureka.hibernate;

import org.hibernate.Session;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class SecondLevelCacheTest {

	public static void main(String[] args) {
		Session session1 = HibernateUtils.getSession();
		Session session2 = HibernateUtils.getSession();
		
		Student st1 = session1.get(Student.class, 101);
		System.out.println(st1);
		
		System.out.println("---------------------------------------------------------------");
		
		Student st2 = session2.get(Student.class, 101);
		System.out.println(st2);
		
		session1.close();
		session2.close();
	}

}
