package com.example.MovieTicketBooking.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name="Ticket")
public class Ticket {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int ticketTotalPrice;
	
	@CreationTimestamp
	private Date bookedAt;
	
	@ManyToOne
	@JoinColumn
	private Show show;
	
	@ManyToOne
	@JoinColumn
	private User user;
}
