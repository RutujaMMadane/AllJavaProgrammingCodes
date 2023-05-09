package com.main;

import javax.transaction.Transaction;

import org.hibernate.Session;

import com.entity.Instructor;
import com.entity.InstructorDetails;
import com.utility.HibernateUtilities;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		org.hibernate.SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		try {
			sessionFactory=HibernateUtilities.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=(Transaction) session.beginTransaction();
			Instructor instructor=new Instructor();
			instructor.setFirstname("Abc");
			instructor.setLastname("Das");
			instructor.setEmail("Abc@gmail.com");
			InstructorDetails instructorDetail=new InstructorDetails();
			instructorDetail.setYoutubeChanel("Coding Ninja");
			instructorDetail.setHobby("Coding");
			instructor.setInstructorDetail(instructorDetail);
			session.save(instructorDetail);
			session.save(instructor);
			transaction.commit();
		}
		catch(Exception e)
		{
			transaction.rollback();
			session.close();
			sessionFactory.close();
			System.out.println(e);
		}

	}

}
