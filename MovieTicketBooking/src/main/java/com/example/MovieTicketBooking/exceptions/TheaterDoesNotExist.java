package com.example.MovieTicketBooking.exceptions;

public class TheaterDoesNotExist extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public static String TheaterDoesNotExist() {
		return "Theater Does not exist";
	}

}
