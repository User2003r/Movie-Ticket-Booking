package com.example.MovieTicketBooking.entity;

import com.example.MovieTicketBooking.enums.SeatType;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TheaterSeat")
public class TheaterSeat {

	private int seatId;
	
	private String seatNo;
	
	private SeatType seatType;
	
	@ManyToOne
	@JoinColumn
	private Theater theater;
	
}
