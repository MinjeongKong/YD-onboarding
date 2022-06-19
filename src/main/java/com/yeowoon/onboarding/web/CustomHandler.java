package com.yeowoon.onboarding.web;

import com.yeowoon.onboarding.web.dto.ResponseDto;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomHandler {
    //    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseDto illegalExHandler(IllegalArgumentException e) {
        return new ResponseDto("FAIL");
    }

    @ExceptionHandler
    public ResponseDto RuntimeExHandler(RuntimeException e) {
        return new ResponseDto("FAIL");
    }

    //    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler
    public ResponseDto exHandler(Exception e) {
        return new ResponseDto("FAIL");
    }
}
