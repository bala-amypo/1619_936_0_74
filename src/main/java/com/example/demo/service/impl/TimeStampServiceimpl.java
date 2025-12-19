package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.TimeStampService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.TimeStampEntity;
import com.example.demo.repository.TimeStampRepository;

@Service
public class TimeStampServiceimpl implements TimeStampService{
    @Autowired TimeStampRepository repo;
    @Override
    public TimeStampEntity postData2(TimeStampEntity std){
        return repo.save(std);
    }
}