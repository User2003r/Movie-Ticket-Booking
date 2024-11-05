package com.example.MovieTicketBooking.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MovieTicketBooking.converter.ShowConverter;
import com.example.MovieTicketBooking.entity.Movie;
import com.example.MovieTicketBooking.entity.Show;
import com.example.MovieTicketBooking.entity.Theater;
import com.example.MovieTicketBooking.exceptions.MovieDoesNotExist;
import com.example.MovieTicketBooking.exceptions.TheaterDoesNotExist;
import com.example.MovieTicketBooking.repository.MovieRepo;
import com.example.MovieTicketBooking.repository.ShowRepo;
import com.example.MovieTicketBooking.repository.TheaterRepo;
import com.example.MovieTicketBooking.request.ShowReq;
import com.example.MovieTicketBooking.request.ShowSeatReq;

@Service
public class ShowService {

	@Autowired
	private ShowRepo showRep;
	
	@Autowired
	private MovieRepo movieRep;
	
	@Autowired
	private TheaterRepo threaterRep;
	
	public ShowService(ShowRepo showRep,TheaterRepo theaterRep,MovieRepo movieRep)
	{
		this.showRep = showRep;
		this.threaterRep = theaterRep;
		this.movieRep = movieRep;
	}
	
	public String addShow(ShowReq showReq)
	{
		Show show = ShowConverter.showReq(showReq);
		
		Optional<Movie> movieOpt = movieRep.findById(showReq.getMovie().getMovieId());
		if(movieOpt.isEmpty())
			throw new MovieDoesNotExist();
		Optional<Theater> theaterOpt = threaterRep.findById(showReq.getTheater().getId());
		if(theaterOpt.isEmpty())
			throw new TheaterDoesNotExist();
		Movie movie = movieOpt.get();
		Theater theater = theaterOpt.get();
		
		showReq.setMovie(movie);
		showReq.setTheater(theater);
		show = ShowConverter.showReq(showReq);
		showRep.save(show);
		movie.getShows().add(show);
		theater.getShowList().add(show);
		movieRep.save(movie);
		threaterRep.save(theater);
		return "Show has been added";
		
		
	}
	
	public String showSeat(ShowSeatReq showSeatReq)
	{
		Optional<Show> showOpt = showRep.findById(showSeatReq.getId());
		
		if(showOpt.isEmpty())
			throw new ShowDoesNotExist;
	}
}
