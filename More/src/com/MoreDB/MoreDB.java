package com.MoreDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.more.model.MoreModel;

public class MoreDB {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/supermarket";
	//Database Credentials
	private final String USER = "root123";
	private final String PASS = "root123";
	int result1=0;
	public int adduser (MoreModel modobj)
	{
		Connection conn=null;
		Statement stmt = null;
		
		
String empid = modobj.getEmpid();
String empname = modobj.getEmpname();
String DeptCode = modobj.getDepcode();
String DOJ = modobj.getDoj();
String Password = modobj.getPass();

try
{
	Class.forName(JDBC_DRIVER);//Registering the driver
    conn=DriverManager.getConnection(DB_URL,USER,PASS);//getting the connection
	stmt = conn.createStatement();
	
	String query = "INSERT INTO userdetails(EmpID,UserName,DeptID,DateOfJoining,Password)VALUES('"+empid+"','"+empname+"','"+DeptCode+"','"+DOJ+"','"+Password+"')";
	System.out.println(query);     
    result1=stmt.executeUpdate(query);
    System.out.println(result1);
}
catch (Exception E)
{
	System.out.println(E.getMessage());
} finally {
			
	}
return(0);
}
}
