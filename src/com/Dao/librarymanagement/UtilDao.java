package com.Dao.librarymanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.databaseconnection.librarymanagement.DatabaseConnection;
import com.model.librarymanagement.Librarian;

public class UtilDao
{
	DatabaseConnection db = new DatabaseConnection();
	
	public static void save(Librarian librarian) throws SQLException
	{
		DatabaseConnection db = new DatabaseConnection();
		Connection connection = db.GetConnection();
		PreparedStatement ps = connection.prepareStatement("insert into librarian values(?,?,?)");
		ps.setInt(1, librarian.getId());
		ps.setString(2, librarian.getName());
		ps.setInt(3, librarian.getAge());
		int result = ps.executeUpdate();
		if(result>0)
			System.out.println("Librarian Inserted Succesfully");
		else
		System.out.println("Record Not Inserted");
		//commented
	}

	
	public void viewlibrarian() throws SQLException
	{
		
		Connection connection = db.GetConnection();
		Statement s = connection.createStatement();
		ResultSet rs = s.executeQuery("select * from librarian");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}
	
	public void removelibrarion(int id) throws SQLException
	{
		Connection connection = db.GetConnection();
		PreparedStatement ps = connection.prepareStatement("delete from librarian where id="+id);
		if(ps.execute())
			System.out.println("Librarian deleted successfully");
		else
			System.out.println("Librarian not deleted");
		
	}
	
	public void getLibrarianCount() throws SQLException
	{
		int count=0;
		Connection connection = db.GetConnection();
		Statement s = connection.createStatement();
		ResultSet rs = s.executeQuery("select Count(id) from librarian");
		while(rs.next())
		 count = rs.getInt(1);
		System.out.println(count);
	}
	
	public boolean validateadmin(String username,String password)throws SQLException
	{
		String uname="";
		String pword="";
		Connection connection=db.GetConnection();
		Statement s = connection.createStatement();
		ResultSet rs=s.executeQuery("select username , password from admin");
		while(rs.next())
		{
			 uname = rs.getString(1);
			 pword = rs.getString(2);
		}
		
		if(uname.equals(username)&&pword.equals(password))
			return true;
		else
			return false;
	}
	
}
