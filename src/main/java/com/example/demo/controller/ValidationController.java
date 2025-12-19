package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;

@RestController
public class ValidationController
{
    @Autowired ValidationService sere;
    @PostMapping("/userdatas")
    public ValidationEntity sendDatas(@Valid @RequestBody ValidationEntity vau){
        return sere.postData(vau);
    }
     @GetMapping("/finddata/{id}")
    public ValidationEntity findd(@PathVariable long id){
        return sere.find(id);
    }
}