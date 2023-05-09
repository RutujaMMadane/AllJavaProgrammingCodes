package UI;

import java.sql.SQLException;
import java.util.Scanner;

import Service.StudentService;

public class StudentMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		{
			String s1;
			Scanner sc=new Scanner(System.in);
			System.out.println("***********StudentManagementSystem***********");
			System.out.println("1.         View Student Details");
			System.out.println("2.         Add Student Details");
			System.out.println("3.         Update Student Details");
			System.out.println("4.         Delete Student Details");
			StudentService s=new StudentService();
			
			do
			{
				System.out.println("Enter your choice ");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					s.ViewAll();
					break;
					
				case 2:
					s.insertStudent();
					break;
					
				case 3:
					s.updateStudent();
					break;
					
				case 4:
					s.deleteStudent();
					break;
				}
				System.out.println("Do you want to continue:");
				s1=sc.next();
			}
			while(s1.equals("yes"));
			
		}
	}

}
