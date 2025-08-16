package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.entity.Mybook;
import com.example.main.entity.book;

@Repository
public interface MybookRespiratory extends JpaRepository<Mybook , Long> {

}