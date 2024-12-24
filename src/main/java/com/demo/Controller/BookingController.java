package com.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demo.Entity.Booking;
import com.demo.Repository.BookingRepository;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin// Allow requests from React frontend
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    // Create a new booking
    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }
    
    @GetMapping
    public ResponseEntity<List<Booking>> getAllBookings() {
        List<Booking> bookings = bookingRepository.findAll();
        return ResponseEntity.ok(bookings);
    }
}
