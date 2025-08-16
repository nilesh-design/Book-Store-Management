package com.example.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mybook 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mybook_id", nullable = false)
    private Long mybook_id;
    private String name ;
    private String auther ;
    private String price ;

    public Mybook(Long mybook_id, String name, String auther, String price) {
        this.mybook_id = mybook_id;
        this.name = name;
        this.auther = auther;
        this.price = price;
    }

    public Mybook() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getMybook_id() {
        return mybook_id;
    }

    public void setMybook_id(Long mybook_id) {
        this.mybook_id = mybook_id;
    }
}