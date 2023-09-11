package com.cinematic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinematic.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
