package com.sopra.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sopra.entities.Booking;

@RepositoryRestResource
public interface BookingRepository extends JpaRepository<Booking, Long> {

	Collection<Booking> findByBookingName(String bn);
}
