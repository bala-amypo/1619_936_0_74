package com.example.demo.service;

import com.example.demo.entity.StudentEntity;

public interface StudentService{
    // postdata
    StudentEntity postdata(StudentEntity stu);
    // getdata no parameter because data is saved nothing else
    List<StudentEntity>getAlldata();
}