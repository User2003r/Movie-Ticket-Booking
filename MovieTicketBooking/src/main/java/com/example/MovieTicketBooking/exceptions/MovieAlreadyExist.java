package com.example.MovieTicketBooking.exceptions;

public class MovieAlreadyExist extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MovieAlreadyExist()
	{
		super("Movie Already Exist");
	}

}
