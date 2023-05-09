package Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import Bean.Student;
import ServiceImplement.StudentDaoImpl;

public class StudentService {
	public void ViewAll() throws ClassNotFoundException, SQLException
	{
		List<Student>list=new StudentDaoImpl().findAll();
		for(Student s:list)
		{
			System.out.println(s);
		}
	}
	public void insertStudent() throws ClassNotFoundException, SQLException
	{
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the student id: ");
		int studentid=sc.nextInt();
		System.out.println("enter the First name: ");
		String firstname=sc.next();
		System.out.println("enter the last name: ");
		String lastname=sc.next();
		System.out.println("enter the date of birth: ");
		String date_of_birth=sc.next();
		System.out.println("enter the age: ");
		int age=sc.nextInt();
		System.out.println("enter the gender: ");
		String gender=sc.next();
		System.out.println("enter the address: ");
		String address=sc.next();
		System.out.println("enter the phone no: ");
		String phone_no=sc.next();
		s.setStudentid(studentid);
		s.setFirstname(firstname);
		s.setLastname(lastname);
		s.setDate_of_birth(date_of_birth);
		s.setAge(age);
		s.setGender(gender);
		s.setAddress(address);
		s.setPhone_no(phone_no);
		new StudentDaoImpl().insertStudent(s);
	}
	public void updateStudent() throws ClassNotFoundException, SQLException
	{
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the First name: ");
		String firstname=sc.next();
		System.out.println("enter the last name: ");
		String lastname=sc.next();
		System.out.println("enter the date of birth: ");
		String date_of_birth=sc.next();
		System.out.println("enter the age: ");
		int age=sc.nextInt();
		System.out.println("enter the gender: ");
		String gender=sc.next();
		System.out.println("enter the address: ");
		String address=sc.next();
		System.out.println("enter the phone no: ");
		String phone_no=sc.next();
		System.out.println("enter the student id: ");
		int studentid=sc.nextInt();
		s.setStudentid(studentid);
		s.setFirstname(firstname);
		s.setLastname(lastname);
		s.setDate_of_birth(date_of_birth);
		s.setAge(age);
		s.setGender(gender);
		s.setAddress(address);
		s.setPhone_no(phone_no);
		new StudentDaoImpl().updateStudent(s);
	}
	public void deleteStudent() throws ClassNotFoundException, SQLException
	{
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the student id: ");
		int studentid=sc.nextInt();
		s.setStudentid(studentid);
		new StudentDaoImpl().deleteStudent(s);
	}
	

}
