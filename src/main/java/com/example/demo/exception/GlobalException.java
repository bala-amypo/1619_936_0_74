package com.example.demo.exception;

import org.springframwork.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvise;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseEntity;

@RestControllerAdvise
public class GlobalException{



    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<String> handleValidationException(ValidationException pt){
        return new ResponseEntity<String>(pt.getMessage(),HttpStatus.Bad_Gateway);
    }
}