package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	public List<Employee>viewAll() throws ClassNotFoundException, SQLException 
	{
		ArrayList<Employee> list=new ArrayList<Employee>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","Rutuja@123");
		//PreparedStatement statement=con.prepareStatement("insert into empnew values(?,?)");
		//PreparedStatement statement=con.prepareStatement("update empnew set ename=? where id=?");
		PreparedStatement statement=con.prepareStatement("select * from empdemo");
		ResultSet rs=statement.executeQuery();
		while(rs.next())
		{
			Employee e=new Employee(2, "daas", 1, 3);
			e.setId(rs.getInt(1));
			e.seteName(rs.getString(2));
			e.setSalary(rs.getFloat(3));
			e.setAge(rs.getInt(4));
			list.add(e);
			
			
		}
	    
		con.close();
		return list;
	}

}
