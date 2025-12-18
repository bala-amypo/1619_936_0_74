package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import java.util.List;

public interface StudentService{
    // postdata
    StudentEntity postdata(StudentEntity stu);
    // getdata no parameter because data is saved nothing else
    List<StudentEntity>getAlldata();
    // delete data
    String StudentEntity deleteData(int id);
}