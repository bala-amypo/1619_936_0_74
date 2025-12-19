package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import com.example.demo.exception.ValidationException;

@RestControllerAdvice
public class GlobalException{



    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<String> handleValidationException(ValidationException pt){
        return new ResponseEntity<String>(pt.getMessage(),HttpStatus.BAD_REQUEST);
    }
}