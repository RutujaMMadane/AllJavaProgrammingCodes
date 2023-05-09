package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.IPLDAO;
import com.entity.IPL;

public class IPLdaoImpl implements IPLDAO
{

	@Override
	public List<IPL> findAll() throws ClassNotFoundException, SQLException
	{
		
		
			ArrayList<IPL> list=new ArrayList<IPL>();
					Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","root");
	       
	        PreparedStatement statement=con.prepareStatement("select * from ipl");
	        ResultSet rs=statement.executeQuery();
	        while(rs.next())
	        {
	        	IPL e=new IPL();

	        	e.setTeamid(rs.getInt(1));
	        	e.setTname(rs.getString(2));
	        	e.setCity(rs.getString(3));
	        	e.setState(rs.getString(4));
	        	list.add(e);
	        }
	        con.close();
			
			
			return list;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertIPL(IPL i) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","root");
       
        PreparedStatement statement=con.prepareStatement("insert into ipl values(?,?,?,?)");
        statement.setInt(1, i.getTeamid());
        statement.setString(2, i.getTname());
        statement.setString(3, i.getCity());
        statement.setString(4, i.getState());
        statement.executeUpdate();
        con.close();
		
	}

	@Override
	public void updateIPL(IPL i) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","root");
       
        PreparedStatement statement=con.prepareStatement("update ipl set tname=?,city=?,state=? where teamid=?");
        
        statement.setString(1, i.getTname());
        statement.setString(2, i.getCity());
        statement.setString(3, i.getState());
        statement.setInt(4, i.getTeamid());
        statement.executeUpdate();
        con.close();
		
	}

	@Override
	public void deleteIPL(IPL i) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","root");
       
        PreparedStatement statement=con.prepareStatement("delete from ipl where teamid=?");
        
       
        statement.setInt(1, i.getTeamid());
        statement.executeUpdate();
        con.close();
		
	}
	

}

