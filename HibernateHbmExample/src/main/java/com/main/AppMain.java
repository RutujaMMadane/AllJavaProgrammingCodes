package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.entity.Login;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration().addResource("Login.hbm.xml").configure("config.xml");
		StandardServiceRegistryBuilder sb=new StandardServiceRegistryBuilder();
		sb.applySettings(cfg.getProperties());
		StandardServiceRegistry registry=sb.build();
		SessionFactory factory=cfg.buildSessionFactory(registry);
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Login l1=new Login("admin","123");
		session.save(l1);
		t.commit();
		session.close();
		

	}

}
