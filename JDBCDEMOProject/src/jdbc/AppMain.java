package jdbc;

import java.sql.SQLException;

public class AppMain {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
		EmployeeDAO d=new EmployeeDAO();
		System.out.println(d.viewAll());
		

	}

}
