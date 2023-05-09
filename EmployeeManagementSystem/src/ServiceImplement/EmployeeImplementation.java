package ServiceImplement;

import java.util.Scanner;
import bean.Employee;
import Service.EmployeeService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class EmployeeImplementation implements EmployeeService {
	Scanner sc=new Scanner(System.in);
	
	List<Employee>list=new ArrayList<Employee>();
	public EmployeeImplementation()
	{
		Employee e1=new Employee(1001,"Rutuja",22000,"Phaltan",2);
		list.add(e1);
	}
	public void addEmployeee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int empid=sc.nextInt();
		System.out.println("Enter the name");
		String ename=sc.next();
		System.out.println("Enter the salary");
		float salary=sc.nextFloat();
		System.out.println("Enter the address");
		String address=sc.next();
		System.out.println("Enter the exp");
		int exp=sc.nextInt();
		Employee e2=new Employee(empid,ename,salary,address,exp);
		list.add(e2);
	}
	public void updateEmployee() 
	{
		System.out.println("Enter id:");
		int id=sc.nextInt();
		int flag=0,index=0;
		Employee s=null;
		for(Employee e:list)
		{
			if(e.geteId()==id)
			{
				flag=1;
				index=list.indexOf(e);
				s=e;
				System.out.println(s);
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Enter the name");
			String ename=sc.next();
			System.out.println("Enter the salary");
			float salary=sc.nextFloat();
			System.out.println("Enter the address");
			String address=sc.next();
			System.out.println("Enter the exp");
			int exp=sc.nextInt();
			
			s.setName(ename);
			s.setAddress(address);
			s.setSalary(salary);
			s.setExp(exp);
			list.set(index, s);
			
			System.out.println("======================================================");
			System.out.println("Employee Details updated!!");
		}
		else {
			
			System.out.println("Id does not exist!!");
		}
		
		System.out.println("======================================================");
		
	}
	public void deleteEmployee()
	{
		
	}
	public void findAllEmployee() 
	{
		if(list.size()==0)
		{
			System.out.println("No record found!!");
		}
		for(Employee s1:list)
		{
			System.out.println(s1);
		}
	}
	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		
	}	
}
