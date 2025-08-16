package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.main.entity.Mybook;
import com.example.main.entity.book;
import com.example.main.service.BookService_Imp;
import com.example.main.service.MybookService_Imp;

import java.util.List;

@Controller
public class bookcontroller {

    @Autowired
    BookService_Imp imp;
    @Autowired
    MybookService_Imp imp1;


    @GetMapping("/home")
    public String homepage(){
        return "home";
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/book_register")
    public String register(){
        return "bookRegister";
    }


    @GetMapping("/Available_book")
    public String getallbook(Model model){

        List<book> books = imp.getall();
        model.addAttribute("books", books);
        return "Available_book";
    }

    @PostMapping("/save")
    public String savebooks(@ModelAttribute book b1){
        imp.save(b1);
        return "redirect:/Available_book";
    }




    @GetMapping("/Mybook")
    public String getmybook(Model model){
        List<Mybook> b1 = imp1.getallmybooks();
        model.addAttribute("b1",b1);
        return "Mybook";
    }

    @RequestMapping("/mylist/{id}")
    public String getmylist(@PathVariable("id") Long id ){
        book b = imp.getbyid(id);
        Mybook b1 = new Mybook(b.getBook_id() , b.getName() , b.getAuther() , b.getPrice());
        imp1.save(b1);
        return "redirect:/Available_book";
    }

    @RequestMapping("/delete/{id}")
    public String deletebook(@PathVariable("id") Long id){
        imp.delete(id);
        return "redirect:/Available_book";
    }


    @RequestMapping("/deletemybook/{id}")
    public String deletemybook(@PathVariable("id") Long id){
        imp1.delete(id);
        return "redirect:/Mybook";
    }

    @RequestMapping( "/editbook/{id}" )
    public String editbook(@PathVariable("id") Long id, Model model){
        book b = imp.getbyid(id);
        model.addAttribute("book",b);
        return "editbook";
    }
}