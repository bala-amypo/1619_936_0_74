package com.exmple.demo.entity;

import jakarta.persistence;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;

@Entity
public class ValidationEntity{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Private Long id;

    @NotNull
    @Size(min=2,max=30,message="2 to 10 character must be there")
    Private String username;

    @Email(message="Give a valid email")
    Private String email;

    @Max6
    @NotNull(message="Password should not be empty")
    Private String password;

    Private Integer age;
}