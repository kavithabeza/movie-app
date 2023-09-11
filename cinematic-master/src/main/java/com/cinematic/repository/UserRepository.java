package com.cinematic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinematic.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
