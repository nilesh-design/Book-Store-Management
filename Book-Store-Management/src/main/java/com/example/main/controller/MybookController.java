package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.main.entity.Mybook;
import com.example.main.service.MybookService_Imp;

@Controller
public class MybookController 
{

    @Autowired
    MybookService_Imp mybook_repo;


    @RequestMapping( "/editMybook/{id}" )
    public String editbook(@PathVariable("id") Long id, Model model){
        Mybook b = mybook_repo.getbyid(id);
        model.addAttribute("Mybook",b);
        return "editbook";
    }


    @PostMapping("/savee")
    public String savebooks(@ModelAttribute Mybook b1){
        mybook_repo.save(b1);
        return "redirect:/Mybook";
    }

}