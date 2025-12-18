package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.entity.StudentEntity;
import java.util.List;


@RestController
public class StudentController
{
    @Autowired StudentService ser;
    @PostMapping("/userdata")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
        return ser.postdata(stu);
    }   
    @GetMapping("/gotdata")
    public List<StudentEntity> getVal(){
        return ser.getAlldata();
    }
    @DeleteMapping("/delete/{id}")
    public String 


}