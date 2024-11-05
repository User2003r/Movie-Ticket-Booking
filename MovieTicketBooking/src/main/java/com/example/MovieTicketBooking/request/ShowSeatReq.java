package com.example.MovieTicketBooking.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowSeatReq {
	private int id;
	private int pricePrimiumSeat;
	private int priceClassicSeat;

}
