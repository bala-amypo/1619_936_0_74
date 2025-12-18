package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.spring.framework.web.bind.annotation.PutMapping;
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
    public String deletesuc(@PathVariable int id){
        return ser.deleteData(id);
    }
    @GetMapping("/finddata/{id}")
    public StudentEntity findd(@PathVariable int id){
        return ser.find(id);
    }
    @PutMapping("/update/{id}")
    public StudentEntity upd(@PathVariable int id,@RequestBody StudentEntity stu){
        return ser.update(id,stu);
    }
}