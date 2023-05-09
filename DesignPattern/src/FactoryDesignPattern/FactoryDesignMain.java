package FactoryDesignPattern;

import java.util.Scanner;

public class FactoryDesignMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetPlanFactory g=new GetPlanFactory();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the plan name");
		String planName=sc.next();
		   System.out.print("Enter the number of units for bill will be calculated: ");
		   int units=sc.nextInt();
		   
		   Plan p=g.getPlan(planName);
				   System.out.print("Bill amount for "+planName+" of "+units+" units is ");
		           p.getRate();
		           p.calculateBill(units);
		
	}

}
