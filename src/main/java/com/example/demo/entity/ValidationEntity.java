package com.exmple.demo.entity;

import jakarta.persistence;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;

@Entity
public class ValidationEntity{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min=2,max=30,message="2 to 10 character must be there")
    private String username;

    @NotNull
    @Email(message="Give a valid email")
    private String email;

    @Size(min=2,max=8,message="The password must be in the range of 2 to 8 ")
    @NotNull(message="Password should not be empty")
    private String password;

    @Positive(message="Age must be a positive number")
    @Max30
    private Integer age;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getUsername(){
        return Username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age=age
    }

    public ValidationEntity( @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min=2,max=30,message="2 to 10 character must be there")
    private String username;

    @NotNull
    @Email(message="Give a valid email")
    private String email;

    @Size(min=2,max=8,message="Password must be in the range of 2 to 8 ")
    @NotNull(message="Password should not be empty")
    private String password;

    @Positive(message="Age must be a positive number")
    @Max30
    private Integer age;){
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.age=age;
    }
    public ValidationEntity(){
        
    }

}