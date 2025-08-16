package com.example.main.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.main.entity.book;

@Service
public interface BookService 
{

    public void save(book b1);

    public List<book> getall();

    public book getbyid(Long id);

    public void delete(Long id);

}