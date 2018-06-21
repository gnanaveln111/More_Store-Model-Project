package com.maveric.service;

import com.maveric.DAO.FlightDao;
import com.maveric.model.FlightBooking;

public class FlightBookingLogic {

	public boolean flightbookingdisplay(FlightBooking bookingModel) {
		boolean addedToDB=false;
		if(bookingModel.getAircraftname().equals("Boeing")) {
			//we will store in db
			System.out.println("I am Adding to Database");
			addedToDB=true;
			FlightDao flightDao = new FlightDao();
			flightDao.addFlightToDB(bookingModel);
		}
		else {
			//we will go to make my trip
			System.out.println("My Aircraft is not Boeing.Redirecting to Make my trip");
		}
		return addedToDB;
		
	}
}
