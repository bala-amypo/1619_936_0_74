package com.exmple.demo.entity;

import jakarta.persistence;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import springframework.web.bind.annotation.NotNull;
import springframework.web.bind.annotation.Size;
import springframework.web.bind.annotation.Email;

@Entity
public class ValidationEntity{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Private Long id;

    @NotNull
    @Size(min=2,max=30,message="2 to 10 character must be there")
    Private String username;

    @Email
    Private String email;

    @
    Private String password;
    Private Integer age;
}