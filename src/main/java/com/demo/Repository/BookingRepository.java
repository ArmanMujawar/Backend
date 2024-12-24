package com.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
