package com.example.MovieTicketBooking.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name="Theater")
public class Theater {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Column(unique = true)
	private String address;
	
	@OneToMany(mappedBy = "theater" , cascade = CascadeType.ALL)
	private List<Show> showList = new ArrayList<>();
	
	@OneToMany(mappedBy = "theater" , cascade = CascadeType.ALL)
	private List<TheaterSeat> theaterSeatList = new ArrayList<>(); 
}
