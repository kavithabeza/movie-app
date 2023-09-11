package com.cinematic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinematic.model.SeatBooked;

public interface SeatBookedRepository extends JpaRepository<SeatBooked, Long> {
}
