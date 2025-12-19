package com.example.demo.service;

import com.example.demo.entity.ValidationEntity;

public interface ValidationService{
    // postdata
    ValidationEntity postData1(ValidationEntity vau);
    // findbyId
    ValidationEntity find1(long id);
}