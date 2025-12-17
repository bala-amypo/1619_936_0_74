package com.example.demo.entity;

import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
// Data
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date created;

}
// Getter and setters for the data
// Name
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
// Id
public Integer getId(){
    return id;
}
public void setId(Integer id){
    this.id=id;
}
// email
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email=email;
}
// password
public String getPassword(){
    return password;
}
public void setPassword(String password){
    this.password=password;
}
// Date
public Date getCreated(){
    return created;
}
public void setCreated(Date created){
    this.created=created
}
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