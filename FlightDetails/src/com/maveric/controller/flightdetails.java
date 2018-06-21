package com.maveric.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maveric.model.FlightBooking;
import com.maveric.service.FlightBookingLogic;

/**
 * Servlet implementation class flightdetails
 */
//@WebServlet("/flightdetails")
public class flightdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public flightdetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String FlightName=request.getParameter("flightname");
		String source=request.getParameter("source");
		String Destination=request.getParameter("Destination");
		String FareinINR=request.getParameter("Fare in INR");
		String Noofseats=request.getParameter("No of seats");
		String Aircraftname=request.getParameter("Aircraftname");
		
		System.out.println("flight name :"+request.getParameter("flightname"));
		System.out.println("Flight name from Form is :"+FlightName);
		System.out.println(request.getParameter("source"));
		System.out.println(request.getParameter("Destination"));
		System.out.println(request.getParameter("Fare in INR"));
		System.out.println(request.getParameter("No of seats"));
		System.out.println(request.getParameter("Aircraftname"));
		
		FlightBooking bookingModel=new FlightBooking();
		bookingModel.setFlightName(FlightName);
		bookingModel.setDestination(Destination);
		bookingModel.setNoOfSeats(Noofseats);
		bookingModel.setSource(source);
		bookingModel.setSource(Aircraftname);
		bookingModel.setAircraftname(Aircraftname);
		
		FlightBookingLogic BusinessLogic=new FlightBookingLogic();
		boolean redirectFlag=BusinessLogic.flightbookingdisplay(bookingModel);
		if(redirectFlag) {
			System.out.println("I added my flight to Database");
		}
		else {
			response.sendRedirect("http://www.makemytrip.com");
			
			
		}
	}

}
