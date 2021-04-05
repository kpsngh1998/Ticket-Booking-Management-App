package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Ticket ID" , nullable = false)
	private Integer id;
	
	@Column(name="Passenger Name")
	private String passenger_name;
	
	@Column(name="Source Station")
	private String source_station;
	
	@Column(name="Destination Station")
	private String destination_station;
	
	@Column(name= "Email ID ")
	private String email;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public String getSource_station() {
		return source_station;
	}
	public void setSource_station(String source_station) {
		this.source_station = source_station;
	}
	public String getDestination_station() {
		return destination_station;
	}
	public void setDestination_station(String destination_station) {
		this.destination_station = destination_station;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
