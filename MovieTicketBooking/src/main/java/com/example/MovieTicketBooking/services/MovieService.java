package com.example.MovieTicketBooking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.MovieTicketBooking.converter.MovieConverter;
import com.example.MovieTicketBooking.entity.Movie;
import com.example.MovieTicketBooking.exceptions.MovieAlreadyExist;
import com.example.MovieTicketBooking.repository.MovieRepo;
import com.example.MovieTicketBooking.request.MovieReq;

@Service
@Component
public class MovieService {

	@Autowired
	MovieRepo movieRep;
	
	public MovieService(MovieRepo movieRep)
	{
		this.movieRep = movieRep;
	}
	
	public String addMovie(MovieReq movieReq)
	{
		Movie movie = movieRep.findMovieByName(movieReq.getMovieName());
		if(movie != null && movie.getLan().equals(movieReq.getLang()))
		{
			throw new MovieAlreadyExist();
		}
		Movie res = MovieConverter.moiveReq(movieReq);
		movieRep.save(res);
		return "Movie added successfully";
		
	}
}
