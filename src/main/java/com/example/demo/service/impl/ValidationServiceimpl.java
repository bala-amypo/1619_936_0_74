package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepository;

@Service
public class ValidationServiceimpl implements ValidationService{
    @Autowired ValidationRepository valide;
    @Override
    public ValidationEntity postData(ValidationEntity vau){
        return valide.save(vau);
    }
    @Override
    public ValidationEntity find(int id){
        return valide.findById(id);
    }

}