package com.dao;


import java.time.LocalDate;


import com.entity.HotelReservation;
import com.entity.Rooms;
import com.utility.hibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CreateDetails 
{
	public  void create()
	{
		  SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
         LocalDate Check_in=LocalDate.now() ;
         LocalDate Check_out=LocalDate.now() ;
         
         HotelReservation hr = new HotelReservation("tanvi","Banglore",99864356l,Check_in,Check_out,109);
         HotelReservation hr1 = new HotelReservation("Ankit","Hyderabad",67584689l,Check_in,Check_out,107);
         HotelReservation hr2 = new HotelReservation("Srinu","Chennai",906579087l,Check_in,Check_out,108);
         HotelReservation hr3 = new HotelReservation("Varshini","Mumbai",98765432l,Check_in,Check_out,110);
         
         
      
        
         
         
         
         Rooms rooms=new Rooms();
         rooms.setRoom_No(109);
         rooms.setRoom_Type("Non-AC");
         rooms.setBed_Type("DoubleBed");
         rooms.setAmount(5000);
         
         Rooms rooms1=new Rooms();
         rooms1.setRoom_No(107);
         rooms1.setRoom_Type("AC");
         rooms1.setBed_Type("SingleBed");
         rooms1.setAmount(2000);
         
         Rooms rooms2=new Rooms();
         rooms2.setRoom_No(108);
         rooms2.setRoom_Type("Non-AC");
         rooms2.setBed_Type("SingleBed");
         rooms2.setAmount(2000);
         
         Rooms rooms3=new Rooms();
         rooms3.setRoom_No(110);
         rooms3.setRoom_Type("AC");
         rooms3.setBed_Type("SingleBed");
         rooms3.setAmount(2000);
         
         
         
         hr.setRooms(rooms);
         session.save(hr);

         session.save(rooms);
         
         hr1.setRooms(rooms1);
         session.save(hr1);

         session.save(rooms1);

         hr2.setRooms(rooms2);
         session.save(hr2);

         session.save(rooms2); 

         hr3.setRooms(rooms3);
         session.save(hr3);

         session.save(rooms3);
		  System.out.println("Inserted Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();

         }
}


