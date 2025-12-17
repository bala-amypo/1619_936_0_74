package com.example.demo.entity



@entity
public class studententity{
    private String name;
    private Integer id;
    private String email;
    private String password;
    private Date created;

}
public String getName(){
    return name;
}
public String setName(String name){
    this.name=name;
}
public Integer getId(){
    return id;
}
public Integer setId(Integer id){
    this.id=id;
}
public String getEmail(){
    return email;
}
public String setEmail(String email){
    this.email=email;
}
public String getPassword(){
    
}