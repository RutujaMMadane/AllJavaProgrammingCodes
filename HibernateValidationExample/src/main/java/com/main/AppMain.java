package com.main;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.entity.FormattingDate;
import com.entity.Product;



public class AppMain {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
        Configuration cfg=new Configuration().addAnnotatedClass(Product.class).configure("config.xml");
		
		StandardServiceRegistryBuilder sb=new StandardServiceRegistryBuilder();
		sb.applySettings(cfg.getProperties());
		StandardServiceRegistry registry=sb.build();
		SessionFactory factory=cfg.buildSessionFactory(registry);
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the product id");
		int pid=sc.nextInt();
		System.out.println("Enetr the product name");
		String pname=sc.next();
		System.out.println("Enetr the product quality");
		int quality=sc.nextInt();
		System.out.println("Enetr the product price");
		double price=sc.nextDouble();
		System.out.println("Enetr the product dob");
		System.out.println("Enter the string to be converted to date");
		String dob=sc.next();
		 
		Date date=FormattingDate.StringToDate(dob);
		System.out.println(date);
		System.out.println("enter the product Available");
		
		boolean isAvailable=sc.nextBoolean();
		
		Product e=new Product();
		e.setpId(pid);
		e.setpName(pname);
		e.setPrice(price);
		e.setQuantity(quality);
		e.setDob(date);
		e.setAvailable(isAvailable);
		session.save(e);
		t.commit();
		session.close();
	}

}
