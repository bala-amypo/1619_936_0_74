package com.example.demo.exception;

import org.springframeworks.web.bind.annotation.RestControllerAdvise;
import org.springframeworks.web.bind.annotation.ExceptionHandler;

@RestControllerAdvise
public class GlobalException{



    @ExceptionHandler(ValidationException.class)
    public ResponseBody<String> handleValidationException(ValidationException pt){
        return new ResponseBody<String>(pt.getMessage(),);
    }
}