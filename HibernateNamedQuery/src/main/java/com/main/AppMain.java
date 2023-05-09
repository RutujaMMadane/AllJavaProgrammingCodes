package com.main;

import java.lang.module.Configuration;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.entity.Employee;

public class AppMain {
	
	public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("config.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		TypedQuety query=session.
		query.
		List<Employee> employees=query.getResultList();
		Iterator<Employee> itr=employees.iterator();
		
		while(itr.hasNext())
		{
			Employee e=itr.next();
			System.out.println(e.getName());
			System.out.println(e.getSalary());
			System.out.println(e.getJob());
		}
		
		Transaction t=session.beginTransaction();
		Login l1=new Login("admin","123");
		session.save(l1);
		t.commit();
		session.close();
		
	}

}
