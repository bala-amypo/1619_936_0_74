package com.example.demo.entity;

import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
// Data,class layer
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date created;


// constructer
public StudentEntity(String name,Integer id,String email,String password,Date created){
    this.name=name;
    this.id=id;
    this.email=email;
    this.password=password;
    this.created=created;
}
// Default constructor
public StudentEntity(){

 }
}