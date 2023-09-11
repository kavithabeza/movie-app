package com.cinematic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinematic.model.Auditorium;

public interface AuditoriumRepository extends JpaRepository<Auditorium, Long> {
}
