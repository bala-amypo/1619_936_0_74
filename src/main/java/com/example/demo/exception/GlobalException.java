package com.example.demo.exception;

import org.springframwork.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvise;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@RestControllerAdvise
public class GlobalException{



    @ExceptionHandler(ValidationException.class)
    public ResponseBody<String> handleValidationException(ValidationException pt){
        return new ResponseBody<String>(pt.getMessage(),HttpStatus.Bad_Gateway);
    }
}