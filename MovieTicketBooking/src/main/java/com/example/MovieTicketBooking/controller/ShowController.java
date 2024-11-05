package com.example.MovieTicketBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieTicketBooking.request.ShowReq;
import com.example.MovieTicketBooking.request.ShowSeatReq;
import com.example.MovieTicketBooking.services.ShowService;

@RestController
@Component
@RequestMapping("/show")
public class ShowController {
	
	@Autowired
	private ShowService showService;

	@PostMapping("/addshow")
	public ResponseEntity<String> addShow(ShowReq show)
	{
		try {
			String res = showService.addShow(show);
			return new ResponseEntity<>(res,HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@PostMapping("/associatesSeat")
	public String showSeat(ShowSeatReq showSeatReq)
	{
		
	}
}
