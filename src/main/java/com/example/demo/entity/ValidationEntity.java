package com.exmple.demo.entity;

import jakarta.persistence;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import springframework.web.bind.annotation.NotNull;

@Entity
public class ValidationEntity{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Private Long id;

    @NotNull
    @Size(min=2,max=30)
    Private String username;
    Private String email;
    Private String password;
    Private Integer age;
}