package com.gworld.weather.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 서버 문제일 때
    @ExceptionHandler(Exception.class)
    public Exception handleAllException(){
        // 에러가 발생했을 때에 누군가에게 알림을 주거나 디비를 재실행 하거나 하는 코드들을 작성
        return new Exception();
    }
}
