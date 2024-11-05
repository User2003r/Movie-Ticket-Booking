package com.example.MovieTicketBooking.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.example.MovieTicketBooking.enums.Genere;
import com.example.MovieTicketBooking.enums.Languange;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Movie")
public class Movie {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	
	@Column(nullable = false)
	private String movieName;
	
	private double movieDuration;
	
	@Enumerated(value=EnumType.STRING)
	private Genere gen;
	
	@Enumerated(value=EnumType.STRING)
	private Languange lan;
	
	private Date releaseDate;
	
	@Column(scale = 2)
	private double rating;
	
	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
	List<Show> shows = new ArrayList<>();
}
