package com.sopra.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Booking {

	private String bookingName;
	@Id
	@GeneratedValue
	private Long id;
	
	public Booking() {}
	
	public Booking(String bookingName) {
		this.bookingName = bookingName;
	}

	public String getBookingName() {
		return bookingName;
	}

	public void setBookingName(String bookingName) {
		this.bookingName = bookingName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Booking [bookingName=" + bookingName + ", id=" + id + "]";
	}
	
	
}
