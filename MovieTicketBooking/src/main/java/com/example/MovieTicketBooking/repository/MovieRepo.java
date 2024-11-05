package com.example.MovieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.MovieTicketBooking.entity.Movie;

@Repository
@Component
public interface MovieRepo  extends JpaRepository<Movie, Integer>{

	Movie findMovieByName(String name);
}
