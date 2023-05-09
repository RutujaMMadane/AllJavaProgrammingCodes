package UI;

import java.io.IOException;
import java.util.Scanner;
import ServiceImplement.EmployeeImplementation;
import bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Management System");
		System.out.println("1.View Employee");
		System.out.println("2.Add Employee");
		System.out.println("3.Update Employee");
		System.out.println("4.Delete Employee");
		System.out.println("Employee Management System");
		EmployeeImplementation e=new EmployeeImplementation();

		do {
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				
				e.findAllEmployee();
				break;
			case 2:
				e.addEmployeee();
			case 3:
				e.updateEmployee();
				break;
			
			}
			System.out.println("do you want to continue");
			s=sc.next();
		}
		while(s.equals("yes"));

	}

}
