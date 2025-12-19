package com.example.demo.entity;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeStamp{

    private Long id;
    private String name;
    private String email;
    private localDateTime created;
    private localDateTime update;

    
}