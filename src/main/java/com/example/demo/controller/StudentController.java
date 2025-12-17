package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.Autowired;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.StudentEntity;

@RestController
public class StudentController
{
    @Autowired StudentService ser;
    @PostMapping("/userdata")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
        return ser.postdata(stu);
    }   


}