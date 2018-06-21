package com.maveric.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.maveric.model.FlightBooking;

public class FlightDao {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/flightdatabase";
	
	//Database credentials
	static final String user = "root";
	static final String pass = "";
	
	public void addFlightToDB(FlightBooking FlightBooking) {
	
		Connection conn=null;
				Statement stmt=null;
		
		try
		{
			//Am registering the driver here
			Class.forName(JDBC_DRIVER);
			
			//getting the connection
			conn=DriverManager.getConnection(DB_URL, user, pass);
		
			
			//creating the statement
			stmt=conn.createStatement();
		
		String aircraft=FlightBooking.getAircraftname();
		String destination=FlightBooking.getDestination();
		String flightname=FlightBooking.getFlightName();
		String source=FlightBooking.getSource();
		String seatcount=FlightBooking.getNoOfSeats();
		String query="INSERT INTO flightdetails"
				+ " (flightname, source, fare, seats, Aircraftname)"
				+ " values ('"+flightname+"', '"+source+"','"+destination+"', '"
				+ seatcount +"','"+aircraft+"')" ;
		int rsult=stmt.executeUpdate(query);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(stmt !=null)
					stmt.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(conn !=null)
					conn.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}
		}
}