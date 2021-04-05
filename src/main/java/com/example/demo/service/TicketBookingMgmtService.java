package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.TicketBookingMgmtRepo;
import com.example.demo.entities.Ticket;

@Service
public class TicketBookingMgmtService {

	@Autowired
	private TicketBookingMgmtRepo ticketbookingrepo;


	public Ticket createTicket(Ticket ticket) {
		return ticketbookingrepo.save(ticket);
	}

	public Optional<Ticket> getOneTicket(Integer id) {
		return ticketbookingrepo.findById(id);
	}

}