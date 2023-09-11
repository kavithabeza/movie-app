package com.cinematic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinematic.model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
