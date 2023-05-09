package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.entity.Course;
import com.entity.Instructor;
import com.utility.HibernateUtilities;


public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory=HibernateUtilities.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Instructor instructor=new Instructor("Malini","Roy","malini@gmail.com");
		
		Course course1=new Course("C for beginners");
		Course course2=new Course("Frist Head Spring");
		
		List<Course> courses=new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		instructor.setCourses(courses);
		course1.setInstructor(instructor);
		course2.setInstructor(instructor);
		session.save(instructor);
		session.save(course1);
		session.save(course2);
		transaction.commit();

	}

}
