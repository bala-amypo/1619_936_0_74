package com.example.demo.controller;



@RestController
public class TimeStampController{
    @Autowired TimeStampService serf;
    @PostMapping("/userdata2")
    public TimeStampEntity sendedData(@RequestBody TimeStampEntity ts){
        return serf.postData2(ts);
    }
}