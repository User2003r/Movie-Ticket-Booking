package com.example.MovieTicketBooking.entity;

import java.util.ArrayList;
import java.util.List;

import com.example.MovieTicketBooking.enums.Gender;

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
@Table(name="Users")
public class User {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(nullable = false)
	private String name;
	
	@Enumerated(value = EnumType.STRING)
	private Gender gender;
	
	@Column(unique = true)
	private String email;
	
	private int age;
	
	private String address;
	
	private String mobileNo;
	
	@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
	private List<Ticket> ticketList = new ArrayList<>();
	
}
