package ServiceImplement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.Student;
import Bean.StudentDao;

public class StudentDaoImpl implements StudentDao {
	
	public List<Student> findAll() throws ClassNotFoundException, SQLException {
		ArrayList<Student> list=new ArrayList<Student>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","Rutuja@123");
        PreparedStatement statement=con.prepareStatement("select * from student");
        ResultSet rs=statement.executeQuery();
		while(rs.next())
		{
			Student t=new Student();
			t.setStudentid(rs.getInt(1));
			t.setFirstname(rs.getString(2));
			t.setLastname(rs.getString(3));
			t.setDate_of_birth(rs.getString(4));
			t.setAge(rs.getInt(5));
			t.setGender(rs.getString(6));
			t.setAddress(rs.getString(7));
			t.setPhone_no(rs.getString(8));
			list.add(t);
		}
		con.close();
		
		return list;
		
	}

	public void insertStudent(Student s) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","Rutuja@123");
        PreparedStatement statement=con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?)");
        statement.setInt(1, s.getStudentid());
        statement.setString(2, s.getFirstname());
        statement.setString(3, s.getLastname());
        statement.setString(4, s.getDate_of_birth());
        statement.setInt(5, s.getAge());
        statement.setString(6, s.getGender());
        statement.setString(7, s.getAddress());
        statement.setString(8, s.getPhone_no());
        statement.executeUpdate();
		con.close();
	}

	public void updateStudent(Student s) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","Rutuja@123");
        PreparedStatement statement=con.prepareStatement("update student set firstname=?,lastname=?,date_of_birth=?,age=?,gender=?,address=?,phone_no=? where studentid=?");
        statement.setString(1, s.getFirstname());
        statement.setString(2, s.getLastname());
        statement.setString(3, s.getDate_of_birth());
        statement.setInt(4, s.getAge());
        statement.setString(5, s.getGender());
        statement.setString(6, s.getAddress());
        statement.setString(7, s.getPhone_no());
        statement.setInt(8, s.getStudentid());
        statement.executeUpdate();
		con.close();
	}

	
	public void deleteStudent(Student s) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","Rutuja@123");
        PreparedStatement statement=con.prepareStatement("delete from student where studentid=?");
        statement.setInt(1, s.getStudentid());
        statement.executeUpdate();
		con.close();
		
	}

}


