package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Ticket;

@Repository
public interface TicketBookingMgmtRepo extends CrudRepository< Ticket , Integer > {

}
