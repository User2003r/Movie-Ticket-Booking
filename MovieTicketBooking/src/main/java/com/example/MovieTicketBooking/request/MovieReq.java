package com.example.MovieTicketBooking.request;

import java.sql.Date;

import com.example.MovieTicketBooking.enums.Genere;
import com.example.MovieTicketBooking.enums.Languange;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieReq {

	private int movieId;
	private String movieName;
	private double movieDuration;
	private Languange lang;
	private Genere gen;
	private double rating;
	private Date releaseDate;
	
	
}
