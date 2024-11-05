package com.example.MovieTicketBooking.converter;

import com.example.MovieTicketBooking.entity.Show;
import com.example.MovieTicketBooking.request.ShowReq;

public class ShowConverter {
	
	public static Show showReq(ShowReq showReq)
	{
		Show show = new Show();
		show.setShowId(showReq.getShowId());
		show.setDate(showReq.getDate());
		show.setMovie(showReq.getMovie());
		show.setShowTiming(showReq.getShowTiming());
		show.setShowSeatList(showReq.getShowSeatList());
		show.setTheater(showReq.getTheater());
		show.setTicketList(showReq.getTicketList());
		return show;
	}
	
	public static ShowReq show(Show show)
	{
		ShowReq showReq = new ShowReq();
		showReq.setShowId(show.getShowId());
		showReq.setDate(show.getDate());
		showReq.setMovie(show.getMovie());
		showReq.setShowSeatList(show.getShowSeatList());
		showReq.setShowTiming(show.getShowTiming());
		showReq.setTheater(show.getTheater());
		showReq.setTicketList(show.getTicketList());
		return showReq;
	}

}
