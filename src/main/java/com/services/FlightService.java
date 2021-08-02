package com.services;

import java.io.PrintWriter;
import java.util.List;

import org.apache.catalina.connector.Response;

import com.beans.Flights;
import com.dao.FlightDao;

public class FlightService {
private FlightDao flightDao;
public FlightService() {
	flightDao = new FlightDao();
}
public Flights getList(String leaving, String arriving, String from, String to) {
	List<Flights> list = flightDao.getAllFlights();
	for (Flights flights : list) {
		if (flights.getStartDate().equals(leaving)&&flights.getReturnDate().equals(arriving)&&flights.getLeaveFrom().equals(from)&&flights.getWhereTo().equals(to)) {
			return flights;
			
		}
	}
	
	return null;
}
}
