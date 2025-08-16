package com.example.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.entity.book;
import com.example.main.repository.bookRespiratory;

@Service
public class BookService_Imp implements BookService{

    @Autowired
    private bookRespiratory repo ;


    public void save(book b1) {
      repo.save(b1);
    }

    public List<book> getall() {
       return repo.findAll();
    }

    public book getbyid(Long id){
        return repo.findById(id).get();
    }

    public void delete(Long id){
        repo.deleteById(id);
    }
    
}