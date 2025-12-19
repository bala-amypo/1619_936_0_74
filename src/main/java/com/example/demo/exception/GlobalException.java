package com.example.demo.exception;

import org.springframeworks.web.bind.annotation.RestControllerAdvise;
import org.springframeworks.web.bind.annotation.

@RestControllerAdvise
public class GlobalException{



    @ExceptionHandler(ValidationException.class)
}