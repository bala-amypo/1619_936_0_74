package com.example.demo.entity



@entity
// Data
public class studententity{

    private String name;
    private Integer id;
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
