package com.example.MovieTicketBooking.exceptions;

public class MovieDoesNotExist extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String MovieDoesNotExsit()
	{
		return "Movie Does not exist";
	}

}
