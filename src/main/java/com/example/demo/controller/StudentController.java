package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.Autowired;
import com.example.demo.service.StudentService;

@RestController
public class StudentController
{
    @Autowired  StudentService ser;


}