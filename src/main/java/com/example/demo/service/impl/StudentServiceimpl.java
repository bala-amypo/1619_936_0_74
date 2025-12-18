package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import java.util.List;


@Service
public class StudentServiceimpl implements StudentService{

    @Autowired StudentRepository student;
    //  save,findAll(),findbyId,deletId(),existbyId()
    @Override
    public StudentEntity postdata(StudentEntity stu){
        return student.save(stu);
    }
    @override
    public List<StudentEntity> getAlldata(){
        return student.findAll();
    }

}