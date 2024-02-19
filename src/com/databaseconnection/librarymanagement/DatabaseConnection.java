package com.databaseconnection.librarymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection 
{
	public static final String url="jdbc:mysql://localhost:3306/librarymanagement";
	public static final String username="root";
	public static final String password="root1234";
	
	
	public  Connection GetConnection() throws SQLException
	{
		Connection connection=DriverManager.getConnection(url, username, password);
		return connection;
	}

}
