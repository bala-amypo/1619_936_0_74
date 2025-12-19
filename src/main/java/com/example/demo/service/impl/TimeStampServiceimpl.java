package com.example.demo.service.impl



@Service
public class Serviceimpl implements ValidationService{
    @Autowired ValidationRepository valide;
    @Override
    public ValidationEntity postData1(ValidationEntity vau){
        return valide.save(vau);
    }