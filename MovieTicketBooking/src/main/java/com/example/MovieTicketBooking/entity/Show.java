package com.example.MovieTicketBooking.entity;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.example.MovieTicketBooking.enums.SeatType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Shows")
public class Show {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int showId;
	
	private Date date;
	
	private Time showTiming;
	
	@ManyToOne
	@JoinColumn
	private Movie movie;
	
	@ManyToOne
	@JoinColumn
	private Theater theater;
	
	@OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
	private List<SeatType> showSeatList = new ArrayList<>();
	
	@OneToMany(mappedBy = "show" ,cascade = CascadeType.ALL)
	private List<Ticket> ticketList = new ArrayList<>(); 
}
