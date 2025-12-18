package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import java.util.List;


@Service
public class StudentServiceimpl implements StudentService{

    @Autowired StudentRepository student;
    //  save,findAll(),findbyId,deleteId(),existbyId()
    @Override
    public StudentEntity postdata(StudentEntity stu){
        return student.save(stu);
    }
    @Override
    public List<StudentEntity> getAlldata(){
        return student.findAll();
    }
    @Override
    public String deleteData(int id){
        student.deleteById(id);
        return "Deleted Successfully";
    }
    @Override
    public StudentEntity find(int id){
        return student.findById(id);
    }

}