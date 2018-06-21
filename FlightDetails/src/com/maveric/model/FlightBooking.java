package com.maveric.model;

public class FlightBooking {

	private String  flightName;
	
	private String  source;
	
	private String  destination;
	
	private String  noOfSeats;
	
	private String  aircraftname;

	public String getAircraftname() {
		return aircraftname;
	}

	public void setAircraftname(String aircraftname) {
		this.aircraftname = aircraftname;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(String noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
}
