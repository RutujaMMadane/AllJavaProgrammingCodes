package com.dao;

import java.util.Scanner;

import com.entity.HotelReservation;
import com.utility.hibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateDetails {

	public void update()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the reservation number");
		int Reservation_no=sc.nextInt();
		
		SessionFactory sessionFactory = hibernateUtility.getSessionFactory();	
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  HotelReservation hr = (HotelReservation)session.get(HotelReservation.class,Reservation_no);
		  hr.setName("Sweety ");
		  hr.setAddress("Guragon ");
		  hr.setRoom_No(109);
		  
		  
		  System.out.println("Updated Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();

	}

}
