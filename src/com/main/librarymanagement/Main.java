package com.main.librarymanagement;

import java.sql.SQLException;
import java.util.Scanner;

import com.Dao.librarymanagement.UtilDao;
import com.model.librarymanagement.Librarian;

public class Main {

	public static void main(String[] args) throws SQLException 
	{
		
		int flag1=0;
		UtilDao utildao = new UtilDao();
		Scanner s = new Scanner(System.in);
		do 
		{
			System.out.println(" 1.Admin login \n 2.Librarian Login");
			flag1=s.nextInt();
			switch(flag1)
			{
			case 1:
			{
				String username="";
				String password="";
				System.out.println("Enter the username :");
				username=s.next();
				System.out.println("enter the Password");
				password=s.next();
				
				if(utildao.validateadmin(username,password))
				{
				System.out.println("Welcome Admin");
				}
				else
			{
				System.out.println("Invalid credentials");
			}
			
			break;
		}
			
			case 2:{
			int option=0;
			do
			{
				System.out.println(" 1.Add Books \n 2.IssueBook \n 3.ReturnBook \n 9.Main Menu");
				option=s.nextInt();
				switch(option)
				{
				case 1: 
				{
					System.out.println("Add Books");
					break;
				}
				
				case 2: 
				{
					System.out.println("Issue Books");
					break;
				}
				
				case 3: 
				{
					System.out.println("Return Books");
					break;
				}

				}
			 }while(option!=9);
			break;
		}
		
			
			}
		}while(flag1!=0);

	}

}
