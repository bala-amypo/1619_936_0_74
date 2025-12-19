package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;

@Entity
public class ValidationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 30, message = "2 to 30 characters required")
    private String username;

    @NotNull
    @Email(message = "Give a valid email")
    private String email;

    @NotNull(message = "Password should not be empty")
    @Size(min = 2, max = 8, message = "Password must be in the range of 2 to 8")
    private String password;

    @Positive(message = "Age must be a positive number")
    @Max(30)
    private Integer age;
    
}
