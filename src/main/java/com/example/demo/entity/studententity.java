package com.example.demo.entity



@entity
// Data
public class studententity{
    private Integer id;
    private String name;
    private String email;
    private String password;

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
// constructer
public studententity(String name,Integer id,String email,String password){
    this.name=name;
    this.id=id;
    this.email=email;
    this.password=password;
}