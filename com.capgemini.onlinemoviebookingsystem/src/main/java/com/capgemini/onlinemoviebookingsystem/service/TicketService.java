package com.capgemini.onlinemoviebookingsystem.service;

import com.capgemini.onlinebookingsystem.dto.Ticket;
import com.capgemini.onlinemoviebookingsystem.dao.TicketDAO;

public class TicketService {
	TicketDAO dao=new TicketDAO();
	public Ticket showTicket(Integer showId)
	{
		Ticket t=dao.details(showId);
		
		return t;
	}

}
