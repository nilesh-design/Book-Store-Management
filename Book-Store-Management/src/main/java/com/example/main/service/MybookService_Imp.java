package com.example.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.entity.Mybook;
import com.example.main.repository.MybookRespiratory;

@Service
public class MybookService_Imp implements MybookService{


    @Autowired
    MybookRespiratory repo;

    public void save (Mybook b1){
        repo.save(b1);
    }

    @Override
    public List<Mybook> getallmybooks() {
       return repo.findAll();
    }

    @Override
    public void delete(Long id){
        repo.deleteById(id);
    }


    @Override
    public Mybook getbyid(Long id){
        return repo.getById(id);
    }
}