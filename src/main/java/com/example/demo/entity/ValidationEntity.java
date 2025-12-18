package com.exmple.demo.entity;

import jakarta.persistence;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

public class ValidationEntity{
    Private Long Interger id;
    Private String username;
    Private String email;
    Private String password;
    Private Integer age;
}