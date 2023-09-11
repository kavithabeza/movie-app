package com.cinematic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinematic.model.Theatre;

public interface TheatreRepository extends JpaRepository<Theatre, Long> {
}
