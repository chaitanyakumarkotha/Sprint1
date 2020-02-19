package com.capgemini.onlinemoviebookingsystem.dao;

import java.util.List;

import com.capgemini.onlinebookingsystem.dto.Seats;
import com.capgemini.onlinemoviebookingsystem.util.BookingState;
import com.capgemini.onlinemoviebookingsystem.util.SeatsRepository;
//import com.capgemini.onlinemoviebookingsystem.util.SeatsRepository;
import com.capgemini.onlinemoviebookingsystem.util.TicketRepository;

//import Repository.BookingState;
//import collections.ShowCollection;

public class MovieBookingDAOImplement {

	public boolean chooseSeats() {
		// TODO Auto-generated method stub
		boolean bookSeat(Integer seatId,Integer showId)
		{
			if(ShowRepository.ShowData.get(showId).getSeats()[seatId-1].bookSeat().getSeatStatus()==BookingState.Booked)
				{
				return true;
				}
			return false;
		}
		public boolean blockSeat(Integer seatId,Integer showId)
		{
			if(ShowCollection.ShowData.get(showId).getSeats()[seatId-1].blockSeat().getSeatStatus()==BookingState.Blocked)
				{
				return true;
				}
			return false;
		}
		
		public boolean isBooked(Integer seatId,Integer showId)
		{
			if(ShowCollection.ShowData.get(showId).getSeats()[seatId-1].getSeatStatus()==BookingState.Booked)
			{
				return true;
			}
			return false;
		}
		public boolean isBlocked(Integer seatId,Integer showId)
		{
			if(ShowCollection.ShowData.get(showId).getSeats()[seatId-1].getSeatStatus()==BookingState.Blocked)
			{
				return true;
			}
			return false;
		}
		public boolean isAvailable(Integer seatId,Integer showId)
		{
			if(ShowRepository.ShowData.get(showId).getSeats()[seatId-1].getSeatStatus()==BookingState.Available)
			{
				return true;
			}
			return false;
		}

		return null;
	}

	public double calculateTotalCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String choosePaymentMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean makePayment(String s, Double d) {
		// TODO Auto-generated method stub
		return false;
	}

	public TicketRepository showTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	/*public boolean cancelBookings(Seats s) {
		// TODO Auto-generated method stub
		return false;
	}*/

	public boolean cancelBookings(SeatsRepository s) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
