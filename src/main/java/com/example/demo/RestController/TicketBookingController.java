package com.example.demo.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Ticket;
import com.example.demo.service.TicketBookingMgmtService;
@RestController
@RequestMapping("/api/tickets")
public class TicketBookingController {

	@Autowired
	private TicketBookingMgmtService ticketbookingservice;

	@PostMapping(value = "/create")
    public Ticket createticket(@RequestBody Ticket ticket)
    {
    	return ticketbookingservice.createTicket(ticket);
    }
    @GetMapping(value = "/ticket/{id}")
    public Optional<Ticket> getoneticket(@PathVariable("id") Integer id)
    {
    	return ticketbookingservice.getOneTicket(id);
    }
	
	
}
