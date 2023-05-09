package com.main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration().addAnnotatedClass(com.entity.Employee.class).configure("config.xml");
		
		StandardServiceRegistryBuilder sb=new StandardServiceRegistryBuilder();
		sb.applySettings(cfg.getProperties());
		StandardServiceRegistry registry=sb.build();
		SessionFactory factory=cfg.buildSessionFactory(registry);
		
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Employee e=new Employee();
		e.setId(12);
		e.seteName("abc");
		e.setAddress("cbe");
		
		session.save(e);
		t.commit();
		session.close();
		

	}

}
