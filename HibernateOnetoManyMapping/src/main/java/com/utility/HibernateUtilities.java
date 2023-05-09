package com.utility;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.entity.Course;
import com.entity.Instructor;

public class HibernateUtilities { 

	private static SessionFactory sessionFactory=null;
    public static SessionFactory getSessionFactory()
    {
    
        	if(sessionFactory==null)
        	{
        		try {
        			Configuration configuration=new Configuration();
        	        Properties settings=new Properties();
        	        
        	        settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        	        settings.put(Environment.URL, "jdbc:mysql://localhost:3306/8657capgemini");
        	        settings.put(Environment.USER, "root");
        	        settings.put(Environment.PASS, "Rutuja@123");
        	        settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
        	        settings.put(Environment.SHOW_SQL, true);
        	        settings.put(Environment.FORMAT_SQL, true);
        	        settings.put(Environment.HBM2DDL_AUTO, "update");          
        	        
        	        configuration.setProperties(settings);
        	        
        	        configuration.addAnnotatedClass(Course.class);

        	        configuration.addAnnotatedClass(Instructor.class);
        	        
        	        ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        	        
        			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        	        
        		}
        		catch(Exception e)
        		{
        			System.out.println(e);
        		}
        	}
        	return sessionFactory;
        }
        
	}


