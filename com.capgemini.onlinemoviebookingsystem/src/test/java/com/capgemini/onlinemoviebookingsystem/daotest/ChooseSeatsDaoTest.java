package com.capgemini.onlinemoviebookingsystem.daotest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.onlinemoviebookingsystem.dao.ChooseSeats;

public class ChooseSeatsDaoTest {
	
	@Test
	public void bookSeatsTest()
	{
		ChooseSeats obj = new ChooseSeats();
		//boolean exp = obj.bookSeat(51, 201);
		//assertEquals(true, exp);
		obj.bookSeat(51,201);
		assertEquals(true,obj.bookSeat(51,201));
	}

}
