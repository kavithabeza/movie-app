package com.cinematic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinematic.model.Screening;

import java.util.List;

public interface ScreeningRepository extends JpaRepository<Screening, Long> {}
