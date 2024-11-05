package com.example.MovieTicketBooking.request;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.example.MovieTicketBooking.entity.Movie;
import com.example.MovieTicketBooking.entity.Theater;
import com.example.MovieTicketBooking.entity.Ticket;
import com.example.MovieTicketBooking.enums.SeatType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowReq {

	private int showId;
	
	private Date date;
	
	private Time showTiming;
	
	private Movie movie;
	
	private Theater theater;
	
	private List<SeatType> showSeatList = new ArrayList<>();
	
	private List<Ticket> ticketList = new ArrayList<>(); 
}
