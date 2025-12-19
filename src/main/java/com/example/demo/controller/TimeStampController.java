package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.TimeStampEntity;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class TimeStampController{
    @Autowired TimeStampService serf;
    @PostMapping("/userdata2")
    public TimeStampEntity sendedData(@RequestBody TimeStampEntity ts){
        return serf.postData2(ts);
    }
}