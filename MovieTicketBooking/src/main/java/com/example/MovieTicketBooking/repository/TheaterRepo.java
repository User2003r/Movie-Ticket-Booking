package com.example.MovieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MovieTicketBooking.entity.Movie;
import com.example.MovieTicketBooking.entity.Theater;

public interface TheaterRepo extends JpaRepository<Theater, Integer>{
	
	Movie findMovieById(int id);
}
