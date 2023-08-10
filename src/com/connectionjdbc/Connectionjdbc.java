package com.connectionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectionjdbc 
{
	static Connection con;

	public static Connection createC()
	{
		
		
		try {
			//load the driver class 
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//create the connection...
			String user ="root";
			String password="Pattu94932@";
			String url="jdbc:mysql://localhost:3306/employeedata";
			
			
			con= DriverManager.getConnection(url,user,password);
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return con;
	}
}