package ProtypeDesignPattern;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id ");
		int id=sc.nextInt();
		System.out.println("Enter the name ");
		String name=sc.next();
		System.out.println("Enter the address ");
		String address=sc.next();
		System.out.println("Enter the salary ");
		float salary=sc.nextFloat();
		Employee e1=new Employee(id,name,address,salary);
		e1.display();
		Employee e2=(Employee) e1.getClone();
		e2.display();


	}

}
