package com.model.librarymanagement;

import java.util.Scanner;

public class Librarian 
{
	Scanner s= new Scanner(System.in);

	int id;
	String name;
	int age;
	
	public Librarian(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*int option=0,age=0;
	String name="";
	do
	{
		System.out.println(" 1.Add Librarian \n 2.View Librarian \n 3.Remove Librarian \n 9.Main Menu");
		option=s.nextInt();
		switch(option)
		{
		case 1: 
		{
			System.out.println("Enter the id ");
			int id=s.nextInt();
			System.out.println("Enter the Librarian Name");
			name = s.next();
			System.out.println("Enter the age");
			age=s.nextInt();
			Librarian librarian = new Librarian(id,name,age);
			utildao.save(librarian);
			break;
		}
		
		case 2: 
		{
			System.out.println("view Libraryian");
			utildao.viewlibrarian();
			break;
		}
		
		case 3: 
		{
			System.out.println("Remove Libraryian");
			int libid=s.nextInt();
			utildao.removelibrarion(libid);
			break;
		}
		
		case 4:
		{
			utildao.getLibrarianCount();
			break;
		}
		
		}
	 }while(option!=9);
	break;*/

	
	
}
