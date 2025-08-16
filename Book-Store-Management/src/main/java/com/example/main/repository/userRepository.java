package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.entity.user;

public interface  userRepository  extends JpaRepository<user,Long> {
    public user findByEmail(String email);

}