package com.example.demo.entity;

import jakarta.persistence.entity;
import jakarta.persistence.Id;

@entity
// Data
public class studententity{
    @Id
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
public String setName(String name){
    this.name=name;
}
// Id
public Integer getId(){
    return id;
}
public Integer setId(Integer id){
    this.id=id;
}
// email
public String getEmail(){
    return email;
}
public String setEmail(String email){
    this.email=email;
}
// password
public String getPassword(){
    return password;
}
public String setPassword(String password){
    this.password=password;
}
// Date
public Date getCreated(){
    return created;
}
public Date setCreated(Date created){
    this.created=created
}
// constructer
public studententity(String name,Integer id,String email,String password){
    this.name=name;
    this.id=id;
    this.email=email;
    this.password=password;
    this.created=created
}
// Default constructor
public studententity(){

}