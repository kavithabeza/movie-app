package com.cinematic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinematic.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
