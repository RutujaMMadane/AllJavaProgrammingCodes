package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Employee;
import com.entity.Project;
import com.utility.HibernateUtilities;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=null;
		Session session=null;
		try {
			sessionFactory=HibernateUtilities.getSessionFactory();
			session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
			Employee emp=new Employee();
			emp.setFirstName("Kunal");
			emp.setLastName("Sharma");
			Project project1=new Project();
			project1.setProjectTitle("java project");
			Project project2=new Project();
			project2.setProjectTitle("Python project");
			emp.getProjects().add(project1);
			emp.getProjects().add(project2);
			session.save(emp);
			transaction.commit();
			
		}
		catch(Exception e) {
			session.close();
			sessionFactory.close();
			System.out.println(e);
		}

	}

}
