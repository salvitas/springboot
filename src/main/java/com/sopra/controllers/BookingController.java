package com.sopra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sopra.dao.BookingRepository;
 
@Controller
public class BookingController {
 
	@Autowired
	private BookingRepository bookingRepository;
	
    @RequestMapping("/bookings.html")
    String bookings(Model model) {
    	model.addAttribute("bookings", this.bookingRepository.findAll());
        return "bookings";
    }
}