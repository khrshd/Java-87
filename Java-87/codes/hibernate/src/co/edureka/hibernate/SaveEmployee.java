package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Employee;
import co.edureka.hibernate.utils.HibernateUtils;

public class SaveEmployee {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Praveen Kumar");
		emp.setEmpSalary(75000.5f);		
		
		session.save(emp);
		
		System.out.println("-------------------------------------------------------");
		tx.commit();
		
		System.out.println("-- employee saved --");		
		session.close();

	}

}
