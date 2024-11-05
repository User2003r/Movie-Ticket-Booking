package com.example.MovieTicketBooking.converter;

import com.example.MovieTicketBooking.entity.Movie;
import com.example.MovieTicketBooking.request.MovieReq;

public class MovieConverter {
	
	public static MovieReq moive(Movie movie)
	{
		MovieReq movieReq = new MovieReq();
		movieReq.setMovieId(movie.getMovieId());
		movieReq.setMovieDuration(movie.getMovieDuration());
		movieReq.setGen(movie.getGen());
		movieReq.setLang(movie.getLan());
		movieReq.setMovieName(movie.getMovieName());
		movieReq.setReleaseDate(movie.getReleaseDate());
		movieReq.setRating(movie.getRating());
		return movieReq;
	}
	
	public static Movie moiveReq(MovieReq movieReq)
	{
		Movie movie = new Movie();
		movie.setMovieId(movieReq.getMovieId());
		movie.setMovieDuration(movieReq.getMovieDuration());
		movie.setGen(movieReq.getGen());
		movie.setLan(movieReq.getLang());
		movie.setMovieName(movieReq.getMovieName());
		movie.setReleaseDate(movieReq.getReleaseDate());
		movie.setRating(movieReq.getRating());
		return movie;
	}

}
