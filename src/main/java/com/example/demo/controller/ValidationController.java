package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import jakarta.validation.Valid;

@RestController
public class ValidationController
{
    @Autowired ValidationService sere;
    @PostMapping("/userdatas")
    public ValidationEntity sendDatas1(@Valid @RequestBody ValidationEntity vau){
        return sere.postData1(vau);
    }
    
    @GetMapping("/finddatas/{id}")
    public ValidationEntity findd1(@Valid @PathVariable long id){
        return sere.find1(id);
    }
}