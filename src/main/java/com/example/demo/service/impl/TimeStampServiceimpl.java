package com.example.demo.service.impl



@Service
public class TimeStampServiceimpl implements TimeStampService{
    @Autowired TimeStampRepository repo;
    @Override
    public TimeStampEntity postData2(TimeStampEntity std){
        return repo.save(std);
    }
}