package UI;

import java.sql.SQLException;
import java.util.Scanner;

import Service.IplService;

public class IPLMain {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
			String s;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("IPLManagementSystem");
	      System.out.println("1.View IPL");
	      System.out.println("2.Add IPL");
	      System.out.println("3.Update IPL");
	      System.out.println("4.Delete IPL");

	      IplService i=new IplService();

	   
	      do
	      {
	    	  
	    	  System.out.println("Enter the choice ");
	    	  int choice=sc.nextInt();
	    	  switch(choice)
	    	  {
	    	  case 1:
	    		  
	    		    i.ViewAll();
	    		    
	    		  break;
	    	  case 2:
	    		  
                  i.insertIPL();
	    		
	    		 	 break;
	    		 
	    	  case 3:
	    		  
                 i.updateIPL();
	      		
	     		 
	     		 break;
	    	  case 4:
	    		  

	        		i.deleteIPL();
	      		 
	      		 break; 	 
	    		  
	    	  }
	    	  System.out.println("do you want to continue");
	    	   s=sc.next();

	       }
		  while(s.equals("yes"));


	}
}
