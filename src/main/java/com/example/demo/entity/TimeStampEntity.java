package com.example.demo.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeStampEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime created;
    private LocalDateTime update;

    @PrePersist
    LocalDateTime = now LocalDateTime().now();
    public void onCreate(){
        this.created=now;
        this.update=now;
    }
    @PreUpdate
    LocalDateTime = now LocalDateTime().now();
    public void onUpdate(){
         this.update=now()
    }

}