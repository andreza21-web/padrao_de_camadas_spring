package com.dev.padraoCamadas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.padraoCamadas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
