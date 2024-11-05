package com.example.MovieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MovieTicketBooking.entity.Show;

public interface ShowRepo extends JpaRepository<Show, Integer>{

}
