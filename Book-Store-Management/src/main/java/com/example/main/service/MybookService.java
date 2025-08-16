package com.example.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.main.entity.Mybook;

@Service
public interface MybookService {

    public void save (Mybook b1);
    public List<Mybook> getallmybooks();

    public void delete (Long id );

    public Mybook getbyid(Long id);
}