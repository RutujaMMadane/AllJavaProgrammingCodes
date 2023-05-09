package com.dao;

import java.util.Scanner;

import com.entity.HotelReservation;
import com.utility.hibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteDetails {

	public void delete() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the reservation number");
		int Reservation_no=sc.nextInt();
		SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		HotelReservation hr = (HotelReservation)session.load(HotelReservation.class, Reservation_no);
		session.delete(hr);
		
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		     sessionFactory.close();

	}

}
